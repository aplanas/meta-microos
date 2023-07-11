SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data. \
 \
This package contains the needed files to compile and link against the \
libksba."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.6.4"

RPM_NAME = "libksba-devel-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "8033cbfac44bdb83cb82ac0fc4591896ace3f3dc721a6c08f6fc5f76207a64459202cef9eb0777b92d899106edb373a1c197f0e1464f6c7a8318d79530cb6d36"

RPROVIDES:${PN} += "libksba-/usr/include/ksba.h \
libksba-devel \
pkgconfig-ksba"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libksba8 \
pkgconfig-gpg-error"

inherit rpm
