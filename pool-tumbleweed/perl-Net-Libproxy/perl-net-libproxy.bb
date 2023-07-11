SUMMARY = "Perl bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Perl for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "perl-Net-Libproxy-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "7e3f09756f0dbe54c30ce2f03bbb02d55eef668d93150d4020ac00620c4ff216400869ca5c9c99a751c4456c9be6cbbad2ffd7620436c2054b0f8abc23dc1758"

RPROVIDES:${PN} += "perl-Net--Libproxy \
perl-Net-Libproxy"

RDEPENDS:${PN} += "libc.so.6 \
libproxy.so.1 \
libproxy1 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
