SUMMARY = "Perl wrappers for the GLib utility and Object libraries"
DESCRIPTION = "This wrapper attempts to provide a perlish interface while remaining as \
true as possible to the underlying C API, so that any reference materials \
you can find on using GLib may still apply to using the libraries from \
perl. This module also provides facilities for creating wrappers for other \
GObject-based libraries. The SEE ALSO section contains pointers to all \
sorts of good information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3293"

RPM_NAME = "perl-Glib-1.3293-1.20.aarch64.rpm"
RPM_HASH = "e5dccc00dbefff7d0640ab9d98f8c6a53169f351bd62f39884d045390f547e544fc1a151ea2bb1bfc971e8951ecd272d1349181dff9e5b523a511b0838bf5fd8"

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
