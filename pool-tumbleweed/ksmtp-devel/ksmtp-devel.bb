SUMMARY = "Development files for KSMTP"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the KSMTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "ksmtp-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "90d399c317c23c5faba8c842549a568b64fec9c49af59c6bcfba5d5fcdf4be5ef6a85c6d8365ea0bde0907a5764a7e84e8913caacfcb81ba46ae962a6e98e859"

RPROVIDES:${PN} += "cmake-KPim5SMTP \
ksmtp-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KF5I18n \
cmake-KF5KIO \
cmake-KPim5Mime \
libKPim5SMTP5"

inherit rpm
