SUMMARY = "Tools for tk"
DESCRIPTION = "The Tix library has, by far, the greatest collection of widgets for \
programming with Tcl/Tk. Highlights include: hierarchical list box, \
directory list/tree view, spreadsheet, tabular list box, combo box, \
Motif style file select box, MS Windows style file select box, paned \
window, note book, spin control widget and many more. With these new \
widgets, your applications will look great and interact with your users \
in intuitive ways."
LICENSE = "BSD-3-Clause"

PV = "8.4.3"

RPM_NAME = "tix-8.4.3-72.17.aarch64.rpm"
RPM_HASH = "4b5b7b75f899fb9bb0c2b087a435b3267097116a30244eac80d322e0801ee3ba1454e1068556c864d26d51b22e012949f24554f50bf4887d106a9fa353279815"

RPROVIDES:${PN} += "libTix8.4.3.so \
tix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tcl \
tk"

inherit rpm
