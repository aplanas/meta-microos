SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python311-recordclass-0.18.0.1-1.5.aarch64.rpm"
RPM_HASH = "6a442cbf847159fe77af6139fc39835983d09fcd8bfde3d02019c324190646ca9836a6a831029221bf3deb070f4b630b37dc9303e6db3469c252eff9047a7a44"

RPROVIDES:${PN} += "python3.11dist(recordclass) \
python311-recordclass \
python311-recordclass(aarch-64) \
python3dist(recordclass)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
