SUMMARY = "Manuals for tanukiwrapper"
DESCRIPTION = "This package contains the manuals for tanukiwrapper"
LICENSE = "GPL-2.0-only"

PV = "3.5.35"

RPM_NAME = "tanukiwrapper-manual-3.5.35-2.7.aarch64.rpm"
RPM_HASH = "8dc01f7736fe16ce265b4fe179a6f53e601c118f0bc2c4def580a0f72dc4afea062049b5f191a8f4ccaef279c8853ab59f0ffaffd72f50601c5987ad04649b67"

RPROVIDES:${PN} += "tanukiwrapper-manual"

RDEPENDS:${PN} += ""

inherit rpm
