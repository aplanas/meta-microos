SUMMARY = "An X Window System client interface to the Present extension to the X protocol"
DESCRIPTION = "libXpresent provides an X Window System client interface to the \
Present extension to the X protocol. \
 \
The Present extension provides a way for applications to update their \
window contents from a pixmap in a well defined fashion, \
synchronizing with the display refresh and potentially using a more \
efficient mechanism than copying the contents of the source pixmap."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXpresent1-1.0.1-2.1.aarch64.rpm"
RPM_HASH = "d9793c78fafc974cd62d38f3108fecc3054313f9ceaccc79e5415bf23edde005ece25b7ca668ec64702efc50063280c7d3b64930f4cac98602035a9785e40e46"

RPROVIDES:${PN} += "libXpresent.so.1 \
libXpresent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
