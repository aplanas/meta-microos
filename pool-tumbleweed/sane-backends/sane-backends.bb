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

RPM_NAME = "sane-backends-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "202a2434e35a58c60fd7fdc40162d74778e2d91f08e388b5b1f050a8555f05d38ce0b4eb8837c100f6ee86e8904b3cc8046a1ae47da9a501de04ba56d1dae137"

RPROVIDES:${PN} += "config(sane-backends) \
sane \
sane-backends \
sane-backends(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-glib.so.8()(64bit) \
libsane.so.1()(64bit) \
libsane1 \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libv4l1.so.0()(64bit) \
libxml2.so.2()(64bit) \
systemd"

inherit rpm
