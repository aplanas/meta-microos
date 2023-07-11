SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.8"

RPM_NAME = "python310-mechanize-0.4.8-6.1.noarch.rpm"
RPM_HASH = "6de82b4e43f178781d3a5724670cd2ade958ca4e4535a2cae15fd0516453ad4d95e0ccb365b9ef865cac82455cc87ccebec336e96f563c6916703c4ca526eaaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mechanize \
python310-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python310-html5lib"

inherit rpm
