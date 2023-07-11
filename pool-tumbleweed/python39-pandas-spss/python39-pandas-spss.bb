SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-spss-2.0.2-4.1.noarch.rpm"
RPM_HASH = "fc5ee76b413424ab26ee6a26bb25456bebf70cfc1452e62618515d910db35415ab00548938727a8244ddf6f967f0f0453e0a0323292c3124953c3a9b7ce4fdd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-spss"

RDEPENDS:${PN} += "python39-pandas \
python39-pyreadstat"

inherit rpm
