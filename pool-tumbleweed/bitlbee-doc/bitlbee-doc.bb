SUMMARY = "IRC to other Chat Networks Gateway (User Guide)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains the user guide: \
  /usr/share/doc/packages/bitlbee/user-guide"
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-doc-3.6-4.4.aarch64.rpm"
RPM_HASH = "45257c078e55a59617ccc871c0ffe0ffcbd51633ad4c578c5c8a849173ce48b70391ece718b16072783bfb3f66aba07fe82f1f631d74e4aea22980c4820e2fb4"

RPROVIDES:${PN} += "bitlbee-doc \
bitlbee-doc(aarch-64)"
RDEPENDS:${PN} += "bitlbee"

inherit rpm
