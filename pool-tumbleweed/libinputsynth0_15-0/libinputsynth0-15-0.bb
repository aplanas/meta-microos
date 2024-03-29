SUMMARY = "Synthesize keyboard and mouse input on X11 and Wayland with various backends"
DESCRIPTION = "Synthesize keyboard and mouse input on X11 and Wayland with various backends."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "libinputsynth0_15-0-0.15.0-1.4.aarch64.rpm"
RPM_HASH = "69fd6d7451dc937930805ee4197ed139f11988bad21865cd3cef5fdb84b6476cfc80d6cab3c848e51380e3493eef1864f277fa840a3159cb81a5b4a8f0a35d42"

RPROVIDES:${PN} += "libinputsynth-0.15.so.0 \
libinputsynth-xdo.so \
libinputsynth-xi2.so \
libinputsynth0-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libxdo.so.3"

inherit rpm
