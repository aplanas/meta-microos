SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python310-web_cache-1.1.0-3.12.noarch.rpm"
RPM_HASH = "178f2f5db7d6a673c42600c71c4e86f39bd8c72a8556e96852fe869cb4a2bad4501ebba1f5c8e041d6fbb62e8d1666c07af3bba2af132ac178ed42208d814566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web_cache \
python3.10dist(web-cache) \
python310-web_cache \
python3dist(web-cache)"
RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
