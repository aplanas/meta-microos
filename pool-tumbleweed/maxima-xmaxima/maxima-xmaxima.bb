SUMMARY = "Tcl/Tk interface to Maxima"
DESCRIPTION = "A graphical interface to the Maxima symbolic computation program. It \
also provides Openmath, a graphics program that can be used from \
Maxima, and a Web browser that accepts a custom html tag to execute \
Maxima commands from an html page. \
 \
Xmaxima is written in the Tcl/Tk language."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-xmaxima-5.46.0-1.20.aarch64.rpm"
RPM_HASH = "248c759915c308a5e8e32e6356a4f27e920746505b765b5d5fc045c5b45fac89d2052164147867ebad27b069585888852296ae79cb76137922512b2c80167b6d"

RPROVIDES:${PN} += "maxima-xmaxima \
xmaxima"

RDEPENDS:${PN} += "/usr/bin/sh \
maxima \
tk"

inherit rpm
