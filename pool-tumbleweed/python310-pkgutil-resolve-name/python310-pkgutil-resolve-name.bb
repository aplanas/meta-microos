SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python310-pkgutil-resolve-name-1.3.10-2.1.noarch.rpm"
RPM_HASH = "6b3d152e2ed2716dd33c3c6ba38a6c20e6b464ac3295f632648637c7791d84d65fccb47822d6e600a9d87de18f3aaf00c5b70612d4ab2993e004bd8128ef0c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pkgutil-resolve-name \
python310-pkgutil-resolve-name \
python3dist-pkgutil-resolve-name"

RDEPENDS:${PN} += "python-abi"

inherit rpm
