SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-test-4.5.0+20230705.ea8c76ff-1.1.noarch.rpm"
RPM_HASH = "7ecc4df8315e7f855a9f6ae3ab76713cbb7f9d2f40e4e66863945f93629e7e3ea0cc26d284a5805fa04cf2e547458f3fa5787c823b2effdd618bd9f5b12eb3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crmsh"

inherit rpm
