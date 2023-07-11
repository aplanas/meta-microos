SUMMARY = "Library files for seafile"
DESCRIPTION = "The libseafile0 package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.3"

RPM_NAME = "libseafile0-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "b8aa36d7ac52d9f8b238c4e2d43b17dba0cf06b9a50f27920c372cf3e268f9cddf8f547778b497bfa272ea71ba43dc9cd25cc25d805ea0e3519d4ef08a3a6019"

RPROVIDES:${PN} += "libseafile.so.0 \
libseafile0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsearpc.so.1"

inherit rpm
