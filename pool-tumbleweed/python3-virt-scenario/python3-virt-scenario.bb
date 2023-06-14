SUMMARY = "Tool to create XML guest configuration and prepare the host for a scenario"
DESCRIPTION = "A tool to generate a customized libvirt XML guest and prepare the host. \
The idea is to improve the experience of usage compared to a basic setting. \
This tool also simplifies the creation of secure VM (AMD SEV)."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "python3-virt-scenario-2.0.4-1.1.noarch.rpm"
RPM_HASH = "0311356ac4940374b56837c497d51fa18a614be016c5b4accf8e443c3af518b7b836888fddd3a4b46a1e73eaeb7acbc88b8e9d2d19e16916adc13f513e43393a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-virt-scenario \
python3-virt-scenario \
python3.10dist-virt-scenario \
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
