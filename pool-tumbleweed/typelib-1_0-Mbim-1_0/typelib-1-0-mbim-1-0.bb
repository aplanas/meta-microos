SUMMARY = "Introspection bindings for libmbim"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol. \
 \
This package provides the GObject Introspection bindings for libmbim."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.4"

RPM_NAME = "typelib-1_0-Mbim-1_0-1.28.4-1.1.aarch64.rpm"
RPM_HASH = "b187776581fd45b5aaf8628f9b0c34c16881a23d1fd5b556d18f4774cfa647a335757c4ae86ffb20a9801fd086c097f31c77a22b52c4bf69c912b3ef97764eff"

RPROVIDES:${PN} += "typelib(Mbim) \
typelib-1_0-Mbim-1_0 \
typelib-1_0-Mbim-1_0(aarch-64)"

RDEPENDS:${PN} += "libmbim-glib.so.4()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
