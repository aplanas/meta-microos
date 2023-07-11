SUMMARY = "Tool to create XML guest configuration and prepare the host for a scenario"
DESCRIPTION = "A tool to generate a customized libvirt XML guest and prepare the host. \
The idea is to improve the experience of usage compared to a basic setting. \
This tool also simplifies the creation of secure VM (AMD SEV)."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python3-virt-scenario-2.1.1-1.1.noarch.rpm"
RPM_HASH = "d8c7012758e273ebca6720f1ffa5e2a80c5de5c53ff88d93200d7256f1c0fd4b0954671d81da493fe77e52c03c3f250c6369b3d24dbbb553b2ada1b0cc9010b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-virt-scenario \
python3-virt-scenario \
python3.11dist-virt-scenario \
python3dist-virt-scenario \
virt-scenario"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-curses \
python3-libvirt-python \
python3-psutil \
python3-pyudev"

inherit rpm
