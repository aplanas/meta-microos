SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python310-zope.i18nmessageid-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "0f0fb4de796bf9b1defb7d0181c9169f4e752ece9dfa5ce017add33c4b53f306d63f585add1cd70d5135efef03eb6985af435136d2181bbafb304b7917b1ea9e"

RPROVIDES:${PN} += "python3-zope.i18nmessageid \
python3.10dist(zope.i18nmessageid) \
python310-zope.i18nmessageid \
python310-zope.i18nmessageid(aarch-64) \
python3dist(zope.i18nmessageid)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
