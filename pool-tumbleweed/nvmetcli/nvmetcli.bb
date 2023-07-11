SUMMARY = "Command line interface for the kernel NVMe nvmet"
DESCRIPTION = "This package contains the command line interface to the NVMe over \
Fabrics target in the Linux kernel. It allows configuring the NVMe \
target interactively as well as saving / restoring the configuration \
to / from a json file."
LICENSE = "Apache-2.0"

PV = "0.7"

RPM_NAME = "nvmetcli-0.7-2.3.noarch.rpm"
RPM_HASH = "a3bb30db4e3ab50421651c4360f215e331e973caa771a2a68f91b38b4d8ce20b66dc0f85bd10dfc64b7fa7fb16033c96208129df9df4290497a02b42213ef599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvmetcli \
python3.11dist-nvmetcli \
python3dist-nvmetcli"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-configshell-fb \
python3-kmod \
systemd"

inherit rpm
