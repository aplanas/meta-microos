SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python310-zope.i18nmessageid-6.0.1-1.3.aarch64.rpm"
RPM_HASH = "784a01d294dca241d3fbaf2821a0d33f612c30faa3313264c7b28ab62d0705fbff39be543dc93102521a2a1d5f0aaa50a7ad4eef352da8e657ee5c6652287da1"

RPROVIDES:${PN} += "python3.10dist-zope.i18nmessageid \
python310-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
