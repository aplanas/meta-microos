SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin that helps you write better list/set/dict comprehensions."
LICENSE = "ISC"

PV = "3.14.0"

RPM_NAME = "python39-flake8-comprehensions-3.14.0-1.1.noarch.rpm"
RPM_HASH = "f40d0d3132368694f8c93cb07347fe2faf2754aa85b4c8015789e11ecc308f343a2214301398796e5ce58c242c013bfcb63dd445893331d6a9f3561c868d6ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-comprehensions \
python39-flake8-comprehensions \
python3dist-flake8-comprehensions"

RDEPENDS:${PN} += "python-abi \
python39-flake8"

inherit rpm
