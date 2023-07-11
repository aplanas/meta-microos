SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python311-zope.security-6.1-2.3.aarch64.rpm"
RPM_HASH = "03bcda83901e1f37729aa2d8a0448e2a430d7be05f428f7692542d2f2412dfcb942c2c2820c0ce193d45fdef1a70e6c07aa8e21edf5a6e65b4ad861d5549ef5c"

RPROVIDES:${PN} += "python3-zope.security \
python3.11dist-zope.security \
python311-zope.security \
python3dist-zope.security"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-pytz \
python311-zope.component \
python311-zope.configuration \
python311-zope.i18nmessageid \
python311-zope.interface \
python311-zope.location \
python311-zope.proxy \
python311-zope.schema"

inherit rpm
