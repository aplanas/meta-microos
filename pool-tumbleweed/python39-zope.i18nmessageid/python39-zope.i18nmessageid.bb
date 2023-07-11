SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python39-zope.i18nmessageid-6.0.1-1.3.aarch64.rpm"
RPM_HASH = "b81dd7c73c2a006206982d4c6b21e664c54062e80ce5136f652c45eca1e64f8d4c23d19966806386d50e3b576b034740046145c05fcd3a3f0286399101817a0d"

RPROVIDES:${PN} += "python3.9dist-zope.i18nmessageid \
python39-zope.i18nmessageid \
python3dist-zope.i18nmessageid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
