SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230809.ddb17a0b"

RPM_NAME = "crmsh-4.5.0+20230809.ddb17a0b-1.1.noarch.rpm"
RPM_HASH = "e9d93ca2b1bb23d2497560d08630d9298cd3e92d5c8bfe4e28f0e8823d42227b568ecd9a34393e6fa4f2db6cdbe6eaf35a7927cfa4fe412dc1df923ab6b54091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crmsh \
crmsh \
python3.11dist-crmsh \
python3dist-crmsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
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
