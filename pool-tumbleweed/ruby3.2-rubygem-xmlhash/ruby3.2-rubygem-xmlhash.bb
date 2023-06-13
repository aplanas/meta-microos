SUMMARY = "Xmlhash is a naive form of XML::Simple"
DESCRIPTION = "A small C module that wraps libxml2's xmlreader to parse a XML \
string into a ruby hash."
LICENSE = "MIT"

PV = "1.3.8"

RPM_NAME = "ruby3.2-rubygem-xmlhash-1.3.8-1.11.aarch64.rpm"
RPM_HASH = "2570df0e6698e22f1a14a67179373a552405780a8909faab107ca05b25747a194fb747960587ad8cefce00fcc8edea4370279e03483eda8e402b6cd7d8ae8eeb"

RPROVIDES:${PN} += "ruby3.2-rubygem-xmlhash \
ruby3.2-rubygem-xmlhash(aarch-64) \
rubygem(ruby:3.2.0:xmlhash) \
rubygem(ruby:3.2.0:xmlhash:1) \
rubygem(ruby:3.2.0:xmlhash:1.3) \
rubygem(ruby:3.2.0:xmlhash:1.3.8) \
rubygem(xmlhash)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libxml2.so.2()(64bit) \
ruby(abi) \
rubygem(ruby:3.2.0:pkg-config)"

inherit rpm
