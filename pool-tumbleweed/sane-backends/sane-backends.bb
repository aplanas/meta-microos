SUMMARY = "SANE (Scanner Access Now Easy) Scanner Drivers"
DESCRIPTION = "The software consists of SANE scanner drivers, \
'scanimage,' and the 'saned' daemon. \
 \
A SANE scanner driver is used via a SANE front-end. \
This package contains the command line front-end 'scanimage'. \
There are graphical front-ends in other packages like \
XSane (package xsane), Skanlite for KDE4 (package skanlite), \
and Kooka for KDE3 (package kdegraphics3-scan). \
 \
The 'saned' daemon provides the service 'sane-port' \
to access scanners that are connected to a server \
via network from client hosts that run the 'net' meta driver."
LICENSE = "GPL-2.0-or-later & SUSE-GPL-2.0+-with-sane-exception & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "sane-backends-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "eb662cd6eac9221b3c52dfe31bcf5f019ca237476c873227513046ca45fccd58f14886d9f4b88bd367f5063c5a300ca5492032c973bc55e939f27be18dfc5051"

RPROVIDES:${PN} += "config-sane-backends \
sane \
sane-backends"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnetsnmp.so.40 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libsane.so.1 \
libsane1 \
libstdc++.so.6 \
libtiff.so.6 \
libusb-1.0.so.0 \
libv4l1.so.0 \
libxml2.so.2 \
systemd"

inherit rpm
