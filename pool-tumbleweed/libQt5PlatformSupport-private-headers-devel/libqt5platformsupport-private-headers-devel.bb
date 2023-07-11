SUMMARY = "Non-ABI stable experimental API for the  Qt5 platform support library"
DESCRIPTION = "This package provides private headers of libQt5PlatformSupport that \
are normally not used by application development and that do not have \
any ABI or API guarantees. The packages that build against these have \
to require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformSupport-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "64cb4845c7b77fcd1b1985c40a57ba2c6bea66d9b608d4b18a75605075db1ec2c7905dac62080735117997e531f96ec5517518eb1fe360e525ab847460693bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PlatformSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PlatformSupport-devel-static"

inherit rpm
