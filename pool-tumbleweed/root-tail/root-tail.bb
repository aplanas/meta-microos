SUMMARY = "Print Text Directly to the X Window System Root Window"
DESCRIPTION = "Tails a given file anywhere on your X Window System root window with a \
transparent background. It is customizable with regards to font, color, \
and more. \
 \
 \
 \
Authors: \
-------- \
    Mike Baker <mjbaker@mtu.edu> \
    Marc Lehmann <pcg@goof.com>"
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "root-tail-1.2-235.20.aarch64.rpm"
RPM_HASH = "40a1316951ae4eb30543f293ecfe9ed6778a5cf2ce43d98f1757ee58b3e51cdf31cd0a6f051b312ee8c6edbc57548614b613d2e7f8bca412b3c75625cc8fa312"

RPROVIDES:${PN} += "root-tail \
root-tail(aarch-64) \
roottail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
