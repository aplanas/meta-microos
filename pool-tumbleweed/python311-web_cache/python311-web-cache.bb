SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python311-web_cache-1.1.0-3.14.noarch.rpm"
RPM_HASH = "94d097866b5e4ee3b5b0e34d2a378f7bf1ef6b88e4fcd41f34267060d9f7de5d4ff2a7af1931fe7bb500ef1d8c02b7d53ce6deeee64995b90c64454889b48cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web-cache \
python3.11dist-web-cache \
python311-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
