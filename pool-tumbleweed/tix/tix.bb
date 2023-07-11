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

RPM_NAME = "tix-8.4.3-72.18.aarch64.rpm"
RPM_HASH = "6610d67bbc50a833e221fd910822f68a7231457fea844e9f757a0188d58eef955c79a971909809754652536b6cc4573754e6ca52a544ebaed9ba1d4ad5fa5d5e"

RPROVIDES:${PN} += "libTix8.4.3.so \
tix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tcl \
tk"

inherit rpm
