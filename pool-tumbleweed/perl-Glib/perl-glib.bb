SUMMARY = "Perl wrappers for the GLib utility and Object libraries"
DESCRIPTION = "This wrapper attempts to provide a perlish interface while remaining as \
true as possible to the underlying C API, so that any reference materials \
you can find on using GLib may still apply to using the libraries from \
perl. This module also provides facilities for creating wrappers for other \
GObject-based libraries. The SEE ALSO section contains pointers to all \
sorts of good information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3294"

RPM_NAME = "perl-Glib-1.3294-1.1.aarch64.rpm"
RPM_HASH = "f96824ed9c842a0045dc9f63a6b7c43750f9e5a8f9b25e15fee543a6c55bd68cf8c1263e8efa50a518cfb6752162ed13010e0651d975bd25e75b03c0efa54290"

RPROVIDES:${PN} += "perl-Glib \
perl-Glib--Bytes \
perl-Glib--CodeGen \
perl-Glib--Error \
perl-Glib--Flags \
perl-Glib--GenPod \
perl-Glib--Install--Files \
perl-Glib--MakeHelper \
perl-Glib--Object \
perl-Glib--Object---LazyLoader \
perl-Glib--Object--Property \
perl-Glib--Object--Property--ReadWrite \
perl-Glib--Object--Property--Readable \
perl-Glib--Object--Property--Writable \
perl-Glib--Object--Subclass \
perl-Glib--ParseXSDoc \
perl-Glib--Variant \
perl-MY"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
