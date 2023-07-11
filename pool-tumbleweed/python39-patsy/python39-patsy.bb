SUMMARY = "A Python package for statistical models and design matrices"
DESCRIPTION = "A Python package for describing statistical models and for \
building design matrices. \
It is closely inspired by and compatible with the 'formula' \
mini-language used in `R <http://www.r-project.org/>`_ and \
`S <https://secure.wikimedia.org/wikipedia/en/wiki/S_programming_language>`_."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python39-patsy-0.5.3-1.5.noarch.rpm"
RPM_HASH = "58178b5d740f7a2426857232446c5e401358dcf34086470215711f020c7e4f3410f899514e17e4ea78003040709d96fa8b8798b07b3e5874ef2740753c0f76d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-patsy \
python39-patsy \
python3dist-patsy"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-six"

inherit rpm
