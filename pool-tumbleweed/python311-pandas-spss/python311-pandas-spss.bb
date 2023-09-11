SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-spss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "bfcd7c2770c4d5606b61935b3321078edc2b6567e016dbe2c3ed4412f00dab86036b2d50747323cebc6f60121566afe72852086dc6e5abfd1f8419b93459603d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-spss \
python311-pandas-spss"

RDEPENDS:${PN} += "python311-pandas \
python311-pyreadstat"

inherit rpm
