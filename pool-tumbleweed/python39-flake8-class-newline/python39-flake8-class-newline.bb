SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-flake8-class-newline-1.6.0-2.10.noarch.rpm"
RPM_HASH = "f97e029b8d3ceb5472102f4e361540d2510dc514c767b803f04ca78f11d987a2156ce962a2b8f411f1ace6d478bf346cd17f383450c7cd8a85bd421437178e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-class-newline \
python39-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
