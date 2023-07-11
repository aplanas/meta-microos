SUMMARY = "A text editor for the terminal"
DESCRIPTION = "Tilde is a text editor for the console/terminal, which provides an \
interface for people accustomed to GUI environments such as \
GNOME, KDE and Windows. For example, the short-cut to copy the \
current selection is Control-C, and to paste the previously copied \
text the short-cut Control-V can be used. As another example, the \
File menu can be accessed by pressing Alt-F."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "tilde-1.1.3-1.6.aarch64.rpm"
RPM_HASH = "3a0e28557b035fc00f11ed59eaad03804ca8ed7fc337dc1b394a8169422e9529f359a5d64cd494f1d942a792a460e39394af85acaadfc4d3f628b1d564819401"

RPROVIDES:${PN} += "tilde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libt3config.so.0 \
libt3highlight.so.2 \
libt3widget.so.2 \
libt3window.so.0 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
