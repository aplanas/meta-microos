SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python3-dogpile.cache-1.2.2-1.1.noarch.rpm"
RPM_HASH = "2d28db49951f8c02d0a2f6b7a50a8ac670143046be60e6afbf8dbffca6656f86339fd193721905f893abf3ef77e625841870286b9353eca4dde6597f1d20f5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogpile.cache \
python3-dogpile.core \
python3.11dist-dogpile.cache \
python3dist-dogpile.cache"

RDEPENDS:${PN} += "python-abi \
python3-decorator \
python3-stevedore"

inherit rpm
