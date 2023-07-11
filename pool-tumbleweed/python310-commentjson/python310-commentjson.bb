SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-commentjson-0.9.0-3.3.noarch.rpm"
RPM_HASH = "2e8f2d3c07b57cab4708f5ff416dfe28ed26405c3b3c3f0747775732f3b6800e33f20630b935e263ed8135deaf11798ceea0c17eafb442ad392c35cdc5d4e55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-commentjson \
python310-commentjson \
python3dist-commentjson"

RDEPENDS:${PN} += "python-abi \
python310-lark \
python310-six"

inherit rpm
