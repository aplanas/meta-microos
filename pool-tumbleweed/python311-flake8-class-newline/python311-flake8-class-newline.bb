SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-flake8-class-newline-1.6.0-2.10.noarch.rpm"
RPM_HASH = "5370dd74a0f4ca59cccadc4fb2b77617338b7d26e05a0311b9a503108cf41e1c8f90c614850e3d6b268aa0999c391d08206d0215eb1cb1bbbca6e2fd1a62d9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-class-newline \
python3.11dist-flake8-class-newline \
python311-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
