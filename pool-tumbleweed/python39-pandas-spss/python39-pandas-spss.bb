SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-spss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "d29314b4bcbb082eace00d598279d63175259b878eda9dba7ad5e779ee2905100ca14f2dfcd7384b1d2eacaae5ec785a77c734747d0ea88e1587135b7517bde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-spss"

RDEPENDS:${PN} += "python39-pandas \
python39-pyreadstat"

inherit rpm
