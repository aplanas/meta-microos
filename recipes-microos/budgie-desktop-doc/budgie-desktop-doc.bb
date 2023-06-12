SUMMARY = "Documentation files for the Budgie Desktop"
DESCRIPTION = "This package provides API Documentation for the Budgie Plugin API, in the \
GTK-Doc HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-doc-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "7120d7eea888f23879daed41fe293e08910182cb92fc68a2722b1182162978cd54dce0af8fcbde156e4bffc9acee235ff8606799affcf1b9a4d1e2a494a2e7b0"

RPROVIDES:${PN} += "budgie-desktop-doc budgie-desktop-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
