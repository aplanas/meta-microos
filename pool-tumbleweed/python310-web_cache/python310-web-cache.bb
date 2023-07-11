SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python310-web_cache-1.1.0-3.14.noarch.rpm"
RPM_HASH = "3d643de0a3103f46f3a5a9ef3a4e2c1c18f2a5d31f388a72cdfa7473be8db0f0831dc11015f4a497ea60136244e25bf97ddb61fc92399f1f9dfa7fde887c9017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-web-cache \
python310-web-cache \
python3dist-web-cache"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
