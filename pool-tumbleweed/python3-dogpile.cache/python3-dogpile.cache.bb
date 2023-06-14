SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python3-dogpile.cache-1.2.1-1.1.noarch.rpm"
RPM_HASH = "0513835585e61421291ed2ca3c049805840c50dd277cea0f3234dacf537ab109d694a94ae16e6ec18eae7982b74e64dc8666f830ad24e4c2e45e1d0d2bfbd808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogpile.cache \
python3-dogpile.core \
python3.10dist-dogpile.cache \
python3dist-dogpile.cache"

RDEPENDS:${PN} += "python-abi \
python3-decorator \
python3-stevedore"

inherit rpm
