SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python311-zope.security-6.1-1.1.aarch64.rpm"
RPM_HASH = "22bfc69ee3fd02e596d1073d4000deec17aec47a19e7ad2ed23b9d67c15ac2c2841afb37c2b86f0db203a8f54d83eaec3e8859e7c08c8f0a03b3c9d8008714ce"

RPROVIDES:${PN} += "python3.11dist-zope.security \
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
