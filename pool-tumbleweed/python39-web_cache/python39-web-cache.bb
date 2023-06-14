SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python39-web_cache-1.1.0-3.12.noarch.rpm"
RPM_HASH = "10421273eee38c5be6ba407e704ab5e628aa53f88d9c2426cff7309a558de9dc93b438ce5ba20f52467d2e246732f636bfdf6fb107843fd4458e9c2b4180d703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-web-cache \
python39-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
