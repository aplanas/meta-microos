SUMMARY = "Panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator3-7-16.10.0+bzr20171205-4.16.aarch64.rpm"
RPM_HASH = "99303a78e7bc73d10c952d93f6b03534e89b96f7d21d84ceddc1f5c2513b7c38df724036330af59a220388066482277b5f0ed276e125c39b55677f1495aeb4ee"

RPROVIDES:${PN} += "libindicator3-7 \
libindicator3.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
