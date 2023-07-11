SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python311-zope.i18nmessageid-6.0.1-1.3.aarch64.rpm"
RPM_HASH = "52fb96111aafd52d0e4cfb2ac35fd12c339ddbec9bbd8dede188b0eeeda9439f7ab6bf6ad67897a3a3dff551da0f5e8e5d81f340c9ab0594b510d28e4429bca1"

RPROVIDES:${PN} += "python3-zope.i18nmessageid \
python3.11dist-zope.i18nmessageid \
python311-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
