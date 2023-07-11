SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python311-pkgutil-resolve-name-1.3.10-2.1.noarch.rpm"
RPM_HASH = "3e419a4d443cfdbdd06e5f51032449f04bc13c0f98f72fdb4e8d84712aefea3ff746f74c2407683bf437c5366791a0b4e1bd55d9ee80baa8d6c46da7ca8b674a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkgutil-resolve-name \
python3.11dist-pkgutil-resolve-name \
python311-pkgutil-resolve-name \
python3dist-pkgutil-resolve-name"

RDEPENDS:${PN} += "python-abi"

inherit rpm
