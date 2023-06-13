SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-commentjson-0.9.0-3.1.noarch.rpm"
RPM_HASH = "170720c475c0b41b581b40e3fb887730e910ab7d14187d4c9b2f5718248807ca3594a4cce6d98af81d481e12923c26b87b1404a7a38aae1f1b7bf9fd6820b6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(commentjson) \
python39-commentjson \
python3dist(commentjson)"

RDEPENDS:${PN} += "python(abi) \
python39-lark \
python39-six"

inherit rpm
