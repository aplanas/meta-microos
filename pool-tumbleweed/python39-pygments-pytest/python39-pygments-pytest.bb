SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-pygments-pytest-2.3.0-2.1.noarch.rpm"
RPM_HASH = "4f7bed003f89d5b67ddf641adbb46fba2a1e5f47558381740074352ca562dba10ef691e83e45bfd8aa2ec5cd931de0b5d2827d4eafcc5028f972a8c21efa09f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-pytest \
python39-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python39-pygments \
python39-pytest"

inherit rpm
