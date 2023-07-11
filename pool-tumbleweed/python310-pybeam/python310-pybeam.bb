SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-pybeam-0.7-1.12.noarch.rpm"
RPM_HASH = "47be4576ce0f41aa655e822e5d7ea74f16a966b95a4a64cb80545d2940753c4827367527694c6320d2fddf9f54bf2cc28921eaaf2c7038875ed118a4a8052606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybeam \
python310-pybeam \
python3dist-pybeam"

RDEPENDS:${PN} += "python-abi \
python310-construct \
python310-six"

inherit rpm
