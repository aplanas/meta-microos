SUMMARY = "LADSPA Effects Rack for JACK"
DESCRIPTION = "JACK Rack is a stereo LADSPA effects rack for the JACK audio API.  You \
can insert LADSPA effects through JACK Rack. It uses GTK+ 2 for the \
GUI."
LICENSE = "GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "jack-rack-1.4.7-142.2.aarch64.rpm"
RPM_HASH = "ec4e5b959b472b84ccbdefee5ca2b4f0a936697dd96409c2faa7a18c738dac0a16a8ca26b63da6386abe63a13f2c3b0a632729b1c9bce9543017af238656e51f"

RPROVIDES:${PN} += "jack-rack"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
jack \
ladspa \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libxml2.so.2"

inherit rpm
