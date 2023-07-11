SUMMARY = "Dynamically create Perl language bindings"
DESCRIPTION = "Dynamically create Perl language bindings"
LICENSE = "LGPL-2.1-only"

PV = "0.050"

RPM_NAME = "perl-Glib-Object-Introspection-0.050-1.2.aarch64.rpm"
RPM_HASH = "0ef5dc93bf8dfc8a422f2755db468d95a785ac44c553989cdc4daec1b167f3697c61037aacfea6db15854a09d9f2186fb595a260c9c1fcd1673c662c75cdf386"

RPROVIDES:${PN} += "perl-Glib--Object--Introspection \
perl-Glib--Object--Introspection---FuncWrapper \
perl-Glib--Object--Introspection--Install--Files \
perl-Glib-Object-Introspection"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
