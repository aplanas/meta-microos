SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python39-web_cache-1.1.0-3.14.noarch.rpm"
RPM_HASH = "44a963e766960563ca1be2a21aebb38f453a6fdbc26fb822e1f662001a78af8956684e321f75b7dd6cdf616f9bf6219d8d7dbfeb4c70534b918750951093f210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-web-cache \
python39-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
