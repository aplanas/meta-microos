SUMMARY = "Perl bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Perl for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "perl-Net-Libproxy-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "1d2fb198c3d572cfc07094623de504dd772ace52ce5ff82f4b7e9abfae0c7b095e4a7c290e9604e33efe75b2b4e03b9bbd6dbfa18bf100a712676d57de1358e1"

RPROVIDES:${PN} += "perl-Net--Libproxy \
perl-Net-Libproxy"

RDEPENDS:${PN} += "libc.so.6 \
libproxy.so.1 \
libproxy1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
