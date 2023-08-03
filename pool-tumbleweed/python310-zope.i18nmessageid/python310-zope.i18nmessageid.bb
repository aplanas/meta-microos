SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python310-zope.i18nmessageid-6.0.1-2.1.aarch64.rpm"
RPM_HASH = "3a335f280b9c7a2e17c68feca4842167d3ee24a889bc7a60ce4006b4b06e9613785fc282ccf9e26f73e44cebb44f8ab8a96ec32736f999df0b2aa96a0c17b690"

RPROVIDES:${PN} += "python3.10dist-zope.i18nmessageid \
python310-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
