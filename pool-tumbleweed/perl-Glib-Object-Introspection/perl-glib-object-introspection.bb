SUMMARY = "Dynamically create Perl language bindings"
DESCRIPTION = "Dynamically create Perl language bindings"
LICENSE = "LGPL-2.1-only"

PV = "0.050"

RPM_NAME = "perl-Glib-Object-Introspection-0.050-1.3.aarch64.rpm"
RPM_HASH = "edfe916e3b59792f007d4064a1f03f3aa94c012572f5300a868ca343cbd37320c0004cd0ed4f4079527a1f82e506247b7ed641dc0eaae1e3c2e42a9cd769b589"

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
perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
