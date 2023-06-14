SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python39-patsy-0.5.3-1.3.noarch.rpm"
RPM_HASH = "d4698cf5add4302ff7197590523aae0461e5227902d226eb0616a2381c76fbb7ab34075d5d563ab1db4fed030a970d4c65e28f5c801d54d7ed3fe21f11979919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-patsy \
python39-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-six"

inherit rpm
