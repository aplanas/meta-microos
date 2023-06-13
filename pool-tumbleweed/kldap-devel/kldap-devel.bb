SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kldap-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "126aedfb370f25528eb562c55be3cd74a4b245e8af0e7d84078d89bcd8516df6b169a468b3fd765177cb24dd68f1d255f64654d2b8a236af787ac9fd1642d615"

RPROVIDES:${PN} += "cmake(KF5Ldap) \
cmake(KPim5Ldap) \
kldap-devel \
kldap-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5CoreAddons) \
cyrus-sasl-devel \
libKPim5Ldap5 \
openldap2-devel"

inherit rpm
