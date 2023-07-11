SUMMARY = "Graphical class browser for Xt"
DESCRIPTION = "viewres displays a tree showing the widget class hierarchy of the \
Athena Widget Set (libXaw)."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "viewres-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "c55f078f5d77b82b9194dbe90fb85114d0d587b7268393c1bfedddf72a393a4d320132b0306114d5cfe7bac2b317eccd448f9670064ea70c44b4f202a51c42ab"

RPROVIDES:${PN} += "viewres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
