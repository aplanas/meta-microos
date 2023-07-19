SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-test-4.5.0+20230705.ea8c76ff-2.1.noarch.rpm"
RPM_HASH = "721d19b02717461dff6862eb343d5284fb72296954dcd0b04531762866c259a2c0e55336820f1bf8e05770511d99999ab15882d5c3dba1cbb6204327d606a7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crmsh"

inherit rpm
