SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230517.b2cb988b"

RPM_NAME = "crmsh-test-4.5.0+20230517.b2cb988b-2.1.noarch.rpm"
RPM_HASH = "f976fd50dee3700109105d500a7330321c3b2868404638b2ac96d74ff4bf2f53936578ed1dfa4ce15631bf0a1f90e198162b9cf3edcc209dfd4f0290793d0990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/awk \
/usr/bin/python3 \
crmsh"

inherit rpm
