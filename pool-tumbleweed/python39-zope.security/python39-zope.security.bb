SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python39-zope.security-6.1-2.3.aarch64.rpm"
RPM_HASH = "22ac23296ff389a10f0e0f93e71b135a9040fbf955ee0989c4d503ad9979e07e7582ebc623fe4e182e9ec24a8d5ef3cd4f1e8d8f6c5506df23f7cdceeed7a813"

RPROVIDES:${PN} += "python3.9dist-zope.security \
python39-zope.security \
python3dist-zope.security"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-pytz \
python39-zope.component \
python39-zope.configuration \
python39-zope.i18nmessageid \
python39-zope.interface \
python39-zope.location \
python39-zope.proxy \
python39-zope.schema"

inherit rpm
