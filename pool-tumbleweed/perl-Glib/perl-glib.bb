SUMMARY = "Perl wrappers for the GLib utility and Object libraries"
DESCRIPTION = "This wrapper attempts to provide a perlish interface while remaining as \
true as possible to the underlying C API, so that any reference materials \
you can find on using GLib may still apply to using the libraries from \
perl. This module also provides facilities for creating wrappers for other \
GObject-based libraries. The SEE ALSO section contains pointers to all \
sorts of good information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3293"

RPM_NAME = "perl-Glib-1.3293-1.18.aarch64.rpm"
RPM_HASH = "70167df349d585dfcc9b541c2c068f82a1f73cfe65154c5eb3ea580a26c75371a06ad2d71713badcbf6932a9669c76862c842429caa8aa5694e0ae3638e14cb5"

RPROVIDES:${PN} += "perl(Glib) \
perl(Glib::Bytes) \
perl(Glib::CodeGen) \
perl(Glib::Error) \
perl(Glib::Flags) \
perl(Glib::GenPod) \
perl(Glib::Install::Files) \
perl(Glib::MakeHelper) \
perl(Glib::Object) \
perl(Glib::Object::Property) \
perl(Glib::Object::Property::ReadWrite) \
perl(Glib::Object::Property::Readable) \
perl(Glib::Object::Property::Writable) \
perl(Glib::Object::Subclass) \
perl(Glib::Object::_LazyLoader) \
perl(Glib::ParseXSDoc) \
perl(Glib::Variant) \
perl(MY) \
perl-Glib \
perl-Glib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::Depends) \
perl(ExtUtils::PkgConfig)"

inherit rpm
