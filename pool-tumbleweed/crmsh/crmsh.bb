SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230725.5d35bb6c"

RPM_NAME = "crmsh-4.5.0+20230725.5d35bb6c-1.1.noarch.rpm"
RPM_HASH = "f29c90414766b9410e57f16381e8bd2fa49c5d688cfbdee4d6ec0237735e66910112c84857627ecd150bc40f55f2cbfb5723c0fda134333c7ff9d8f004e22d80"
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
