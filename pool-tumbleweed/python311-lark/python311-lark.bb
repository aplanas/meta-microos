SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python311-lark-1.1.5-2.3.noarch.rpm"
RPM_HASH = "24d8066e8be7a7784c7337554e1256983cd9ad7c9e9a4741f974d9c0d3cb23e19a96f4648f9e9d793ff7e3b50a26e2737ccec4b75ace3138032fc35bf6b91f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lark \
python3-lark-parser \
python3.11dist-lark \
python311-lark \
python311-lark-parser \
python3dist-lark"

RDEPENDS:${PN} += "python-abi"

inherit rpm
