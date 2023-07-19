SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-4.5.0+20230705.ea8c76ff-2.1.noarch.rpm"
RPM_HASH = "cce9a58456547f7f77b09df3f076bf01ac72b1a3ce7afead6ea162cd44e9dfd8b4877f9724158f4403a84346dbaf778dc454772dce62bc5da21a56b4d982a994"
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
