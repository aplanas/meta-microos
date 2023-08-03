SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python39-zope.i18nmessageid-6.0.1-2.1.aarch64.rpm"
RPM_HASH = "a077c98cff8592876610bb07f5cc0badcf1c5e92c96ea1c7b5bcd953beb6f827e43d03ddb77cf4137a47c95e0ce1e2f8a31295965b266090dd20041240b1d8f0"

RPROVIDES:${PN} += "python3.9dist-zope.i18nmessageid \
python39-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
