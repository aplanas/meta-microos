SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-commentjson-0.9.0-3.1.noarch.rpm"
RPM_HASH = "aeda4ec76d83e41fabe2a198ff0d1541d8ab6661d7103bb8d02da62ff40a08dbcb742d5780d2482df026dece721024cb1ba38055ab5f896e4879b2828e675c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-commentjson \
python3.10dist-commentjson \
python310-commentjson \
python3dist-commentjson"

RDEPENDS:${PN} += "python-abi \
python310-lark \
python310-six"

inherit rpm
