SUMMARY = "Non-ABI stable experimental API for the Qt5 print support library"
DESCRIPTION = "This package provides private headers of libQt5PrintSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "9f7ad27726cfba2feda5472d7beabb5312410e25804cfa6e885e616f84bc670054eb1c2aaa4540c1f6d8e5ccd1b9b6d02f693554b08a71aaa7c776c3a72ec2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PrintSupport-private-headers-devel"

RDEPENDS:${PN} += "cups-devel \
libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PrintSupport-devel \
libQt5Widgets-private-headers-devel"

inherit rpm
