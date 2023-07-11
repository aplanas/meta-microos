SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python311-patsy-0.5.3-1.5.noarch.rpm"
RPM_HASH = "d7902aa985ce80f9b389f4b14a559246260c0aaf2787ae27f8dab2393a386c05b1a2211b5f4176708dace071b061d1f2d7e319ca33f00710aa353296d1bc1aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patsy \
python3.11dist-patsy \
python311-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-six"

inherit rpm
