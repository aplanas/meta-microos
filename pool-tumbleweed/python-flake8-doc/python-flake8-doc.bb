SUMMARY = "Documentation files for python-flake8"
DESCRIPTION = "Flake8 is a modular extensible source code checker. \
 \
This package provides documentation for python-flake8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python-flake8-doc-6.0.0-2.3.noarch.rpm"
RPM_HASH = "3aee9aa7b0fd1ec64a08eb37efcbba319e7ac263e4dff1e09b2f58b6dc4ab76e5bd88f2a2e2850467af8a0e9fee51f60448344cc86bf3178fa0e962f253791db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flake8-doc"

RDEPENDS:${PN} += ""

inherit rpm
