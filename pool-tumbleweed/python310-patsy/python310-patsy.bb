SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python310-patsy-0.5.3-1.5.noarch.rpm"
RPM_HASH = "34e5d39df3b54d691c06ea2f3174ea13560cc9631008b37195e95743f0193a13630e9af8c5c7dc3181509892dc10771a60c1311d2f7c21893273b38d0b1cec9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-patsy \
python310-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-six"

inherit rpm
