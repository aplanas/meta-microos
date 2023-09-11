SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python310-specfile-0.22.0-1.1.noarch.rpm"
RPM_HASH = "9c11a591d5865769b15bc08cb8485119cc8a2b3f4275d5130c625ecbf61bedc5369f5b33132b4ebd2c4c034d8f2884e3ce3ef50c609def28f6f10e49a3e679f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-specfile \
python310-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python310-rpm \
python310-typing-extensions \
python311-typing-extensions \
python39-typing-extensions"

inherit rpm
