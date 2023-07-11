SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-specfile-0.18.0-1.3.noarch.rpm"
RPM_HASH = "a062d4487066f0a50679db027e487e45fe3b64aabe0087a97d9d126d703b799a879440d7da5a6714b97775a161a7c7b85e524934fa10b03b399ab38fbaddcd08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile \
python3.11dist-specfile \
python311-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python311-rpm"

inherit rpm
