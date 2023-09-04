SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "1cf36d9e62e3c582b496f4c1d32fe6b299da74df365b2a19386c63bc5486a42b55c20e64ebbff8991ec1f03d1309561a784b9f8470783baa357b6fff974c0daf"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-32bit"

RDEPENDS:${PN} += ""

inherit rpm
