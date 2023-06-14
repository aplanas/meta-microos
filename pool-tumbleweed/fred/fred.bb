SUMMARY = "Forensic Registry EDitor, an editor for Microsoft Registry hives"
DESCRIPTION = "Forensic Registry EDitor (fred) is a editor for Microsoft Registry \
hives with special features useful during forensic analysis, such as \
a hex viewer with data interpreter and a reporting function that can \
be extended with custom ECMAScript report templates."
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "fred-0.2.0-1.16.aarch64.rpm"
RPM_HASH = "8e8788380a18d3dbcafdf15b1b8b8dbb577d823ca1b92e98d42f80051c38e7dbbd51799f5e41811ee05f0a51a9f7c13d7082017a7324d596d969d0c0b725bbda"

RPROVIDES:${PN} += "fred"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Script.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhivex.so.0 \
libstdc++.so.6"

inherit rpm
