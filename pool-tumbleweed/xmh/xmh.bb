SUMMARY = "Graphical user interface to send and read mail with MH"
DESCRIPTION = "The xmh program provides a graphical user interface to the \
MH Message Handling System. To actually do things with your \
mail, it makes calls to the MH package."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xmh-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "7c9ecdf0334e91059cc0f62ea0d9bd236d707ac89576e232d8aebd9744bbd35433869c27e243a62c07f0886260b6a5ab81fb086c0028879be722b5b4325fb587"

RPROVIDES:${PN} += "xmh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
nmh"

inherit rpm
