SUMMARY = "Perl wrappers for the GLib utility and Object libraries"
DESCRIPTION = "This wrapper attempts to provide a perlish interface while remaining as \
true as possible to the underlying C API, so that any reference materials \
you can find on using GLib may still apply to using the libraries from \
perl. This module also provides facilities for creating wrappers for other \
GObject-based libraries. The SEE ALSO section contains pointers to all \
sorts of good information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3293"

RPM_NAME = "perl-Glib-1.3293-1.19.aarch64.rpm"
RPM_HASH = "19b5b17bfe983ed26519d87ce39d8026b4797aeb02a062e313dd654eeff0647e8dd9397a3ff211d6b76d77468b7c7ed1cc24ddf342a442f914de887b48618a06"

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
perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
