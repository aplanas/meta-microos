SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-spss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e6c69ca2053f2966ebc3576b8298679aa2fc867aeaf8768cf181dee64dce83baec4bfed89efe81f5538b209bc4968163f13669ce425764b82d66c1d69c0718cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-spss"

RDEPENDS:${PN} += "python39-pandas \
python39-pyreadstat"

inherit rpm
