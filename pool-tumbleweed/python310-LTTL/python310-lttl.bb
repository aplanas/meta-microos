SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python310-LTTL-2.0.12-2.9.noarch.rpm"
RPM_HASH = "a456e9d10be9495496f11605c8d80bb6c939b75b79c015d21057618c96f6499f894f714164747afba1a3bce40c5464f9778cd283be1689c3eed6ce31d80dd1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-LTTL \
python3.10dist(lttl) \
python310-LTTL \
python3dist(lttl)"

RDEPENDS:${PN} += "python(abi) \
python310-future \
python310-numpy \
python310-scipy"

inherit rpm
