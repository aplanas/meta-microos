SUMMARY = "Development files for KSMTP"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the KSMTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ksmtp-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "16235c9b689ad6cdc33afd04e821a5f4d485f80a2ad56bec8cd34743968510c92ba56d655693fba89e0de4e2f8698613ea8bd80ddb425f54ecb0db57bcc3e218"

RPROVIDES:${PN} += "cmake-KPim5SMTP \
cmake-KPimSMTP \
ksmtp-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KF5I18n \
cmake-KF5KIO \
cmake-KPim5Mime \
libKPim5SMTP5"

inherit rpm
