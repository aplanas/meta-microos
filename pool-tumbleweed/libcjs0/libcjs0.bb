SUMMARY = "Shared Libraries for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides libraries for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "libcjs0-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "a0524ea3985c5b6bd3193ac8e129095af468bffa20c80a7abae46147ebc3e6f214bcee862eff97e57eebc7e99d4a436d93a055a5a9bd793dee5e79ebfd0f7b07"

RPROVIDES:${PN} += "libcjs.so.0()(64bit) \
libcjs0 \
libcjs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmozjs-78.so.0()(64bit) \
libmozjs-78.so.0(mozjs_78)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
typelib(CjsPrivate) \
typelib(GIRepository) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(cairo)"

inherit rpm
