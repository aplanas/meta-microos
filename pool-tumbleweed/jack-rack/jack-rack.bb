SUMMARY = "LADSPA Effects Rack for JACK"
DESCRIPTION = "JACK Rack is a stereo LADSPA effects rack for the JACK audio API.  You \
can insert LADSPA effects through JACK Rack. It uses GTK+ 2 for the \
GUI."
LICENSE = "GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "jack-rack-1.4.7-142.1.aarch64.rpm"
RPM_HASH = "fe5bbed5dfd11c36e68f2f5c761eaf11f4767ca7326b648d0cc614e39afced8dee54fa9be1b99b81bc9e7072cd36f1a8ba42577faa9b13542dea72935379ce6c"

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
