SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python311-zope.i18nmessageid-6.0.1-2.1.aarch64.rpm"
RPM_HASH = "b4829f5239d0d1a3c6fa6246025ecca87a24cf68865fb8855914882dab90152568ba2106a5322200634f167cd8b293a22580d838ef2268f9d5f74d5f7991623e"

RPROVIDES:${PN} += "python3-zope.i18nmessageid \
python3.11dist-zope.i18nmessageid \
python311-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
