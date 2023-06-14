SUMMARY = "X Event Interception Extension library"
DESCRIPTION = "libXevie provides an X Window System client interface to the EvIE \
extension to the X protocol. The EvIE (Event Interception Extension) \
allows for clients to be able to intercept all events coming through \
the server and then decide what to do with them, including being able \
to modify or discard events."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libXevie1-1.0.3-13.1.aarch64.rpm"
RPM_HASH = "520dc007ad9a9459f67275fa44d920ee00c32cce3ebe2d1766e2994edb98437bb62295fd8b5ba0a4a8762624f69c053b75d034f5aeabc118ddb94868a1b5a547"

RPROVIDES:${PN} += "libXevie.so.1 \
libXevie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
