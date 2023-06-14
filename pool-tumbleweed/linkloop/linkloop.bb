SUMMARY = "Test network connectivity at link layer (layer-2)"
DESCRIPTION = "Linkloop is similar to ping, but tests the network connectivity at the \
link layer (layer 2) instead of the network layer (layer 3). \
 \
 \
 \
Authors: \
-------- \
    Oron Peled <oron@actcom.co.il> \
    Dominique Domet de Mont <Dominique.Domet-de-Mont@hp.com>"
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "linkloop-1.0.0-22.26.aarch64.rpm"
RPM_HASH = "891219366a4ca7c237af3aab545e014cf733c95a31ffd07a67801a3b999b6d04c8a1374f74f6b75975c9bb3d7187badf4d3380befe324eda50be808f077f4e4a"

RPROVIDES:${PN} += "linkloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
