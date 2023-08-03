SUMMARY = "Tool to create XML guest configuration and prepare the host for a scenario"
DESCRIPTION = "A tool to generate a customized libvirt XML guest and prepare the host. \
The idea is to improve the experience of usage compared to a basic setting. \
This tool also simplifies the creation of secure VM (AMD SEV)."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "python3-virt-scenario-2.1.2-1.1.noarch.rpm"
RPM_HASH = "e60ce7917496346f849515fe80dd6c46a62b493dd093d7f23a60922590768b03724b61ac33369c6b1f2851a697e69840bb0631eff157e479640f3ab940519742"
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
