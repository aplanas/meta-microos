SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python310-zope.security-6.1-2.3.aarch64.rpm"
RPM_HASH = "58bdbbb94641f5ee621f84aae01260a83d0dc40b1b59176c7d462e53ab8a6188e8e06978ba6f2f72f9d3f370c24465b7ea44c99b8d8289e9e8c13f01f4e66a81"

RPROVIDES:${PN} += "python3.10dist-zope.security \
python310-zope.security \
python3dist-zope.security"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-pytz \
python310-zope.component \
python310-zope.configuration \
python310-zope.i18nmessageid \
python310-zope.interface \
python310-zope.location \
python310-zope.proxy \
python310-zope.schema"

inherit rpm
