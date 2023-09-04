SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230809.ddb17a0b"

RPM_NAME = "crmsh-test-4.5.0+20230809.ddb17a0b-1.1.noarch.rpm"
RPM_HASH = "9379c1b63f664a4fae7985f6a90ea129469e4d18d56c572096bb2ddc14ae7b090b7a0bca67183832333fdd02ca0efac9bd6191e8f991aee9c3c4308d5f43cbe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
crmsh"

inherit rpm
