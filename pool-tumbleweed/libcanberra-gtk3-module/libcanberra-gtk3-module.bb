SUMMARY = "Portable sound event library -- GTK+ 3 Module"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a GTK+ 3 module that triggers input feedback \
event sounds."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk3-module-0.30-15.23.aarch64.rpm"
RPM_HASH = "8f45ae381611cd0928baa50e9d158e501af0c5ab044b3f37e2904a16d00e2e307a0927631498c217822ba74f3bd72c6d2f182b9d453ab5ad750951ff56f850b4"

RPROVIDES:${PN} += "libcanberra-gtk3-module \
libcanberra-gtk3-module.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra-gtk-module-common \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
