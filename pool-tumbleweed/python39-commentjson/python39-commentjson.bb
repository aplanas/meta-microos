SUMMARY = "Add Python and JavaScript style comments in your JSON files"
DESCRIPTION = "`commentjson` (Comment JSON) is a Python package that helps you create JSON \
files with Python and JavaScript style inline comments. Its API is very similar \
to the Python standard library's `json` module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-commentjson-0.9.0-3.3.noarch.rpm"
RPM_HASH = "282738fdfc52645bf39e66f49e5c19b1288b8d9a1b0eed00190903b8c8460bcd60ac44de8e34883f676855a31495b0ee5fb7fa101a7d304dcb444b49e5a73d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-commentjson \
python39-commentjson \
python3dist-commentjson"

RDEPENDS:${PN} += "python-abi \
python39-lark \
python39-six"

inherit rpm
