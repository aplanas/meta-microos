SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python311-specfile-0.20.0-1.1.noarch.rpm"
RPM_HASH = "ffe4c535dd294da8e181c52574f116f2989ec7d798888376c2b314b4ed4696980b7c8f4673af7dc4b8183fe20bc9514ce352a923abe4869c30b58b0effe2e9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile \
python3.11dist-specfile \
python311-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python311-rpm"

inherit rpm
