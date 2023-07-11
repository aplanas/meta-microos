SUMMARY = "Backport of Python 3.9's pkgutil.resolve_name"
DESCRIPTION = "Backport of Python 3.9's pkgutil.resolve_name which \
resolves a name to an object."
LICENSE = "MIT & Python-2.0"

PV = "1.3.10"

RPM_NAME = "python39-pkgutil-resolve-name-1.3.10-2.1.noarch.rpm"
RPM_HASH = "b36c3b31bcde56ea4ab009f74494d0bbf4b6bd875244889f27a411a149e53d16f2873ebf9422151cfcc9a40e5eea54a718a0cf8cff78c68278b5727cad1a8fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pkgutil-resolve-name \
python39-pkgutil-resolve-name \
python3dist-pkgutil-resolve-name"

RDEPENDS:${PN} += "python-abi"

inherit rpm
