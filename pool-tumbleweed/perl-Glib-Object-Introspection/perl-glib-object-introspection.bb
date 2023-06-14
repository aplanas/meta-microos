SUMMARY = "Dynamically create Perl language bindings"
DESCRIPTION = "Dynamically create Perl language bindings"
LICENSE = "LGPL-2.1-only"

PV = "0.050"

RPM_NAME = "perl-Glib-Object-Introspection-0.050-1.1.aarch64.rpm"
RPM_HASH = "4c00ed8d2203c67e2067b3a9c7a08de45fdee43861dc58aa0455ae8b0033201e6b9e7de7acc4130e8eb9d19ecf055d9fcd75ae012c0d668c53e94dc7a7511562"

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
perl--MODULE-COMPAT-5.36.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
