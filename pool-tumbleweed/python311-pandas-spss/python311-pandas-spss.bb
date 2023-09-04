SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-spss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "67f67e2cd92e36768e01434ae870134dc08e6e4fcdc9a5dde081b773ab1dd97fa7bb4968cf084a49da7e1467c3ffebd8c8fd08641ec9aa9d6c5dcee1589300ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-spss \
python311-pandas-spss"

RDEPENDS:${PN} += "python311-pandas \
python311-pyreadstat"

inherit rpm
