SUMMARY = "A caching front-end based on the Dogpile lock"
DESCRIPTION = "A caching API built around the concept of a 'dogpile lock', which allows \
continued access to an expiring data value while a single thread generates a \
new value."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python3-dogpile.cache-1.2.1-1.2.noarch.rpm"
RPM_HASH = "8bcf42d9f27d8300ed510f3c751e8e1da987798c506a9c3859721e08ef7091ccd5bd6c5478bf30846603b948bbf0de76d7dc671207aa7fa9a07213e0f5dc3d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogpile.cache \
python3-dogpile.core \
python3.11dist-dogpile.cache \
python3dist-dogpile.cache"

RDEPENDS:${PN} += "python-abi \
python3-decorator \
python3-stevedore"

inherit rpm
