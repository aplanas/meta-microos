SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230427.11d11104"

RPM_NAME = "crmsh-4.5.0+20230427.11d11104-1.1.noarch.rpm"
RPM_HASH = "c7bc3737cf6261d125d8b8fed4c9cac5bb3f8b2c604abe2ca0fe7f9413f34a78fb4f513a724c37890cea64deda6c350bd7019186b3ba712cd3c326e210e622a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(crmsh) crmsh python3.10dist(crmsh) python3dist(crmsh)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/which crmsh-scripts csync2 pacemaker python(abi) python3 python3-PyYAML python3-curses python3-lxml python3-parallax python3-python-dateutil"

inherit rpm
