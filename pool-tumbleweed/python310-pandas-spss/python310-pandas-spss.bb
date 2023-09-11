SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-spss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "4772df3ee189ebe6c480274e06e4f1cb35245c117dd994d0d0d458f0346bf658d18f72d26ab6c4f2900b8e1e755978dfd54b49847961a5b1182bb4d3694be6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-spss"

RDEPENDS:${PN} += "python310-pandas \
python310-pyreadstat"

inherit rpm
