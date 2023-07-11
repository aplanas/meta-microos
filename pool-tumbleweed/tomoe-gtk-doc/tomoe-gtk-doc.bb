SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-doc-0.6.0-44.25.aarch64.rpm"
RPM_HASH = "f22270a8be9a92ff3267ee04e23dab576ab66061640b42d8841795466148c8738d179ac59415257364e0f21ca81ccad56cdd04b0138bec42edaef2857665ab09"

RPROVIDES:${PN} += "tomoe-gtk-doc"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
