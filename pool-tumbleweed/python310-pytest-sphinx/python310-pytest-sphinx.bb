SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-sphinx-0.5.0-1.1.noarch.rpm"
RPM_HASH = "db0e7ee36e8e3ed5ca9ddaa4473e1b034f25599e69258fc5c7bfcb097bc01e6cdde35edc435708b6bcf3527e0c4f17d29494516c92999c9ecc312d2f6977afb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sphinx \
python3.10dist-pytest-sphinx \
python310-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
