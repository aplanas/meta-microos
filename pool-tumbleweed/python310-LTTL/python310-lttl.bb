SUMMARY = "Library for text processing and analysis"
DESCRIPTION = "LangTech Text Library (LTTL) for text processing and analysis"
LICENSE = "GPL-3.0-only"

PV = "2.0.12"

RPM_NAME = "python310-LTTL-2.0.12-2.11.noarch.rpm"
RPM_HASH = "ccfd311a260d2afa2fb5f8d35a9bc632ea3eab56296236de58ae9c9a33df81e8e21e9fc422f8efc0d019e7d89cc645b5f81847560e131cfc9673642383693add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lttl \
python310-LTTL \
python3dist-lttl"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-numpy \
python310-scipy"

inherit rpm
