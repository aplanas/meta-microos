SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). \
 \
This subpackage contains the API definition files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp-devel-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "246ceffe76a402dbf8915614fcd3c6ff4fdc7700933f284d2cc75ec6e92dadca05c1fdbd618a77f3ecdaf1f7adb4daaad04e9910b56375922dcb886a76c77c68"

RPROVIDES:${PN} += "libesmtp-devel \
pkgconfig-libesmtp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libesmtp6-2-0 \
pkgconfig-openssl"

inherit rpm
