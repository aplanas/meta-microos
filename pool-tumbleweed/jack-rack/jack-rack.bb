SUMMARY = "LADSPA Effects Rack for JACK"
DESCRIPTION = "JACK Rack is a stereo LADSPA effects rack for the JACK audio API.  You \
can insert LADSPA effects through JACK Rack. It uses GTK+ 2 for the \
GUI."
LICENSE = "GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "jack-rack-1.4.7-142.1.aarch64.rpm"
RPM_HASH = "fe5bbed5dfd11c36e68f2f5c761eaf11f4767ca7326b648d0cc614e39afced8dee54fa9be1b99b81bc9e7072cd36f1a8ba42577faa9b13542dea72935379ce6c"

RPROVIDES:${PN} += "application() \
application(jack-rack.desktop) \
jack-rack \
jack-rack(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
jack \
ladspa \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
