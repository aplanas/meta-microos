SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python310-zope.security-6.1-1.1.aarch64.rpm"
RPM_HASH = "708e60cba940249dfb758a5c93d96d4d3df3470e3641919752be15e5566cdce2d73ae3d29aa289ff3da8618b978bf2ba9078eb6e734221995ad07803c552fe23"

RPROVIDES:${PN} += "python3-zope.security \
python3.10dist-zope.security \
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
