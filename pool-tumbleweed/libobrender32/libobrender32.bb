SUMMARY = "Openbox Render Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
for theme rendering."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobrender32-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "cf57da3fcba9730433318c421ec10aeae0a8445dc091aa116b1304eaf754e477b0c06d37f0140e1f8da730844b23e89bdd787319006e26f86aa911c7767017fd"

RPROVIDES:${PN} += "libobrender.so.32 \
libobrender32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libobt.so.2 \
libpango-1.0.so.0 \
libpangoxft-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
