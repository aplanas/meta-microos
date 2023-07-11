SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kldap-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1a4a24ff55ab20a2ffb52661e1cb4583eb637a615d3cd680a1b37fa165901ae6043f99ca16a3926a49f925ce22c46e47bd6ebb34625589d0d8b8ecbdec267504"

RPROVIDES:${PN} += "cmake-KF5Ldap \
cmake-KPim5Ldap \
kldap-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cyrus-sasl-devel \
libKPim5Ldap5 \
openldap2-devel"

inherit rpm
