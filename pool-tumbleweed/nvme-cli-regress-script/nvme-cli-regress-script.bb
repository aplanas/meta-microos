SUMMARY = "A small script to test the nvme binary for regressions"
DESCRIPTION = "A small shell script to test the nvme binary for regressions. It requires an \
NVMe device for testing purposes. Do NOT use in a production environment."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-regress-script-2.4-2.1.noarch.rpm"
RPM_HASH = "d941b9d936a9a62a4b07a40e4387c3b6088a2a72b24543fd870391fc65555082c95427d458bc788833db551819ce35a528107bebb27b7dbd00131931b764ec20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-regress-script"

RDEPENDS:${PN} += "/usr/bin/bash \
nvme-cli"

inherit rpm
