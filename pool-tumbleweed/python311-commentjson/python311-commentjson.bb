SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-commentjson-0.9.0-3.1.noarch.rpm"
RPM_HASH = "97cdb17fcaaa22b8c0e87eacc1adf168339d74b04aa80d706368c2daa728b62129ae470776724c3b37be21ed6fc594b330324c8d5926070a83c69c196f3e98ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(commentjson) \
python311-commentjson \
python3dist(commentjson)"
RDEPENDS:${PN} += "python(abi) \
python311-lark \
python311-six"

inherit rpm
