SUMMARY = "A small script to test the nvme binary for regressions"
DESCRIPTION = "A small shell script to test the nvme binary for regressions. It requires an \
NVMe device for testing purposes. Do NOT use in a production environment."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-regress-script-2.4-1.2.noarch.rpm"
RPM_HASH = "4666b53500bdd56c182167ccf1b7a4e47cc0c639f74fc5956c0593fa3991f1c7402c59ec29716ea685af43ddc816cf7629f0100fe1ee3de867dec6b8ad614d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-regress-script"

RDEPENDS:${PN} += "/usr/bin/bash \
nvme-cli"

inherit rpm
