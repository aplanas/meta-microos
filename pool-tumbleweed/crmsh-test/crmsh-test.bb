SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230725.5d35bb6c"

RPM_NAME = "crmsh-test-4.5.0+20230725.5d35bb6c-1.1.noarch.rpm"
RPM_HASH = "14c0b5c2f23dcd12436b382867330778fe1e6ba789e9bee3a9023a5592f0070740f24a566ff3daa05f9342d9f24c429bd30f2b8f6355049b75211c17e417d9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
crmsh"

inherit rpm
