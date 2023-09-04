SUMMARY = "The python pandas[spss] extra"
DESCRIPTION = "This package provides the [spss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-spss-2.0.3-1.2.noarch.rpm"
RPM_HASH = "2be3760ac710803f22099bc21cb761c9d3574337e2a0f6545cc4971c74e8d39f8c25b3ec0550ae85db9e63b34c223829385894c5c9b10e095d9ef97f43909c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-spss"

RDEPENDS:${PN} += "python310-pandas \
python310-pyreadstat"

inherit rpm
