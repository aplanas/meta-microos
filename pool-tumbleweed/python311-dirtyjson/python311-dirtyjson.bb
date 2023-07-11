SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-dirtyjson-1.0.8-1.5.noarch.rpm"
RPM_HASH = "25acbf3e5f555e7a9576f34d400a73676cbb8c8137db2e1a9664dc1d023a4b52bb39ae89172b85ec412627a076b0d09d51a53d537a85ab17261fd26264eff64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirtyjson \
python3.11dist-dirtyjson \
python311-dirtyjson \
python3dist-dirtyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
