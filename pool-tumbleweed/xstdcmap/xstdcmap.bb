SUMMARY = "Utility to define standard colormap properties"
DESCRIPTION = "The xstdcmap utility can be used to selectively define standard colormap \
properties. It is intended to be run from a user's X startup script to \
create standard colormap definitions in order to facilitate sharing of \
scarce colormap resources among clients using PseudoColor visuals."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "xstdcmap-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "15893358fd9b5f438478f6a2da605069cb82609d4e85cbe0e5e1475abca7b5fa2327be2bfd3cd0b8d42cb3de6b937516152259b9d464aac3cec5093d82667db7"

RPROVIDES:${PN} += "xstdcmap \
xstdcmap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXmu.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
