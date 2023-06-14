SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230517.b2cb988b"

RPM_NAME = "crmsh-4.5.0+20230517.b2cb988b-2.1.noarch.rpm"
RPM_HASH = "d1f65fc33495a78e7008705ea90172ca8a42958eb61fcdcb52ebafbe6084d4cc3178239068c3b426019509f5b3c3707b908fe26d65e1a848c65c88424f437cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crmsh \
crmsh \
python3.10dist-crmsh \
python3dist-crmsh"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/python3.10 \
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
