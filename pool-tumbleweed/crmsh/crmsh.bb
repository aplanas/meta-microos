SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-4.5.0+20230705.ea8c76ff-1.1.noarch.rpm"
RPM_HASH = "916c0d49d63f2175a5d4b5b65529ff443b84a8f9a19c10246a96189a94b5821116fbf034f16b39d6256834cdb4eba55a0f6dbfc7db7c1aa19cfb568babd55c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crmsh \
crmsh \
python3.11dist-crmsh \
python3dist-crmsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/which \
crmsh-scripts \
csync2 \
pacemaker \
python-abi \
python3 \
python3-PyYAML \
python3-curses \
python3-lxml \
python3-python-dateutil"

inherit rpm
