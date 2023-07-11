SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-parver-0.4-1.4.noarch.rpm"
RPM_HASH = "237a79829c998dbf1162dc2840e7fa6a06035e3cfa7860a50f2417209572c9ddf3e15086afbd8684602bb1f7bf112114169605562fe020a772bd37389b675765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parver \
python3.11dist-parver \
python311-parver \
python3dist-parver"

RDEPENDS:${PN} += "python-abi \
python311-Arpeggio \
python311-attrs \
python311-typing-extensions"

inherit rpm
