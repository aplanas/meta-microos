SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-commentjson-0.9.0-3.3.noarch.rpm"
RPM_HASH = "78b0a717afef2647b71960b48aca16b5c1fb6aefe041b33196706abbb587c53fec27711e2ed3eb1cafe422584431eec21b0530bfc1bda30e0a4f8713fbea4fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-commentjson \
python3.11dist-commentjson \
python311-commentjson \
python3dist-commentjson"

RDEPENDS:${PN} += "python-abi \
python311-lark \
python311-six"

inherit rpm
