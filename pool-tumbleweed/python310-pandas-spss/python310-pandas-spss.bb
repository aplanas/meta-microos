SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-spss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "eb2352ad965aa42ad33bdf7696e14784027dd7d9933783908a3501b5593787cb263439209ca1f78a065331bc02fcb2d89d302ae69f7ac81f592606953a60105e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-spss"

RDEPENDS:${PN} += "python310-pandas \
python310-pyreadstat"

inherit rpm
