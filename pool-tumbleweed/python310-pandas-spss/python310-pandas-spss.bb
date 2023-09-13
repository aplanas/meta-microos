SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-spss-2.1.0-1.2.noarch.rpm"
RPM_HASH = "385d0275b99655463076582a6e48799248793075122ee98ee2fd59ddf27234744d12be859b3846c95b91e253e61210283c6ccef2ac68b83b8d40988ff2aa2803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-spss"

RDEPENDS:${PN} += "python310-pandas \
python310-pyreadstat"

inherit rpm
