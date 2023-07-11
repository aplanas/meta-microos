SUMMARY = "Introspection bindings for the BAMF window matching library"
DESCRIPTION = "This package contains introspection data for the Bamf library. \
 \
This package provides the GObject Introspection bindings for Bamf."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "typelib-1_0-Bamf-3_0-0.5.6-1.5.aarch64.rpm"
RPM_HASH = "99dce5243c7db179fed20aeac9851a3acc0e173f06d1e13af15e933457852beec33d29aac1b06b585b17c498ba1f7ccc2b5243f0065a7be7fc018730aa3e8d42"

RPROVIDES:${PN} += "typelib-1-0-Bamf-3-0 \
typelib-Bamf"

RDEPENDS:${PN} += "libbamf3.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
