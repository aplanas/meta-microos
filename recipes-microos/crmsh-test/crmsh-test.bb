SUMMARY = "Test package for crmsh"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features. \
This package contains the regression test suite for crmsh."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230427.11d11104"

RPM_NAME = "crmsh-test-4.5.0+20230427.11d11104-1.1.noarch.rpm"
RPM_HASH = "955ef00460bd9ba7af10d6b39dcd4cad34e18f1441ce8f8ea1a7280a747b7b2d81fbc9a6da9ad4532a957d1ed536d0e537d589b36fb0251fcd4e4154a228d0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-test"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/awk /usr/bin/python3 crmsh"

inherit rpm
