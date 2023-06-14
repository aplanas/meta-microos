SUMMARY = "A collection of text-based games"
DESCRIPTION = "A new collection of console games inspired by the classic bsd-games collection."
LICENSE = "CC0-1.0"

PV = "5"

RPM_NAME = "nbsdgames-5-1.4.aarch64.rpm"
RPM_HASH = "d7844bca59018a48b1cd3ceee990ec519b7796e3010e314baa42d983fc06a59f35f7a658a33c153d8c0700dece8fde7472d196226ce77d470acd2e757f68f039"

RPROVIDES:${PN} += "nbsdgames"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
