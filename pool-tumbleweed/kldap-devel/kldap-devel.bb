SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kldap-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e24ce65ec27cfa0541a6f28300d06d0223733fcd6bd3d7121ccec6d098af177492d49346900c7983d57b628e9ffc92a7335cdc05101d4d16a1ffa13b87f7977c"

RPROVIDES:${PN} += "cmake-KPim5Ldap \
kldap-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cyrus-sasl-devel \
libKPim5Ldap5 \
openldap2-devel"

inherit rpm
