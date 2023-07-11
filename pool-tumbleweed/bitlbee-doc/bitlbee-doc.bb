SUMMARY = "IRC to other Chat Networks Gateway (User Guide)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains the user guide: \
  /usr/share/doc/packages/bitlbee/user-guide"
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-doc-3.6-4.5.aarch64.rpm"
RPM_HASH = "022bfc8146650370236c58b26ca169e7d3fb3507d3bce354476daf728d466c25ba68ce1876cbde8e57a28669a93214e0d52d95a238505261e7bbe934cc6c1255"

RPROVIDES:${PN} += "bitlbee-doc"

RDEPENDS:${PN} += "bitlbee"

inherit rpm
