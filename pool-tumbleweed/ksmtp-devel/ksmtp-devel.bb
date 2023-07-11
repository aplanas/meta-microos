SUMMARY = "Development files for KSMTP"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the KSMTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ksmtp-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a1cafc76ee073bf7943cf65495d5b4c4cef5224a1f9f9bf847a4a772b7666b76256e0cc8f2547f2f5750f5f4127678b923a418568f0e05e3df60b83c87e89aa2"

RPROVIDES:${PN} += "cmake-KPim5SMTP \
cmake-KPimSMTP \
ksmtp-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KF5I18n \
cmake-KF5KIO \
cmake-KPim5Mime \
libKPim5SMTP5"

inherit rpm
