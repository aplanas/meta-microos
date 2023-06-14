SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python310-pkgutil-resolve-name-1.3.10-1.3.noarch.rpm"
RPM_HASH = "38f40d6852c7c680c2d669eeef21d279412b1554959cb28c1c92cffbb648f8da897072e98ed754c6520e0d2e6763c42bacf800fca017b27ce8d1f55c00281047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkgutil-resolve-name \
python3.10dist-pkgutil-resolve-name \
python310-pkgutil-resolve-name \
python3dist-pkgutil-resolve-name"

RDEPENDS:${PN} += "python-abi"

inherit rpm
