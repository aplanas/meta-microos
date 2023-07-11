SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-purl-1.6-2.3.noarch.rpm"
RPM_HASH = "ca6391c2b3416b502bc193f8e100db2842b50ee47e6daa5d90606d9443ffec79741e4074c9c8e0f5babb552e71b8a7b9b5c9b09a1a27a4d4bf3ab2d2116f7034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-purl \
python39-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
