SUMMARY = "Tcl/Tk interface to Maxima"
DESCRIPTION = "A graphical interface to the Maxima symbolic computation program. It \
also provides Openmath, a graphics program that can be used from \
Maxima, and a Web browser that accepts a custom html tag to execute \
Maxima commands from an html page. \
 \
Xmaxima is written in the Tcl/Tk language."
LICENSE = "GPL-2.0-or-later"

PV = "5.47.0"

RPM_NAME = "maxima-xmaxima-5.47.0-1.3.aarch64.rpm"
RPM_HASH = "853cd61a1d63922a0db74a62df4f9e3febddc92356a36cd25e612abd619dc735c1e17612d6318299f710b7f0884263bcf3ebaed7b0a6fb1452e20b08619fbfc4"

RPROVIDES:${PN} += "maxima-xmaxima \
xmaxima"

RDEPENDS:${PN} += "/usr/bin/sh \
maxima \
tk"

inherit rpm
