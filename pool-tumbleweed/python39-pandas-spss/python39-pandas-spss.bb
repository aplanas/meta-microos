SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-spss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c9cf56472ed6086aa1137d46df7eb405e4c7d74949913520dc58de93b1a3791b828db81cb6bf64d0ab4eb1724288583367a8aac63a3ac4a1c54e0a5b6d497548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-spss"

RDEPENDS:${PN} += "python39-pandas \
python39-pyreadstat"

inherit rpm
