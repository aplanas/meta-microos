SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-pybeam-0.7-1.12.noarch.rpm"
RPM_HASH = "49c02d177d3b93887f96f078d3ef83a758641f345a1fa38754363b9f2e41ac9273bf5699bddca9cf28d194b20795eb4acb8b946519058b85c7bd307ef75ac721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybeam \
python3.11dist-pybeam \
python311-pybeam \
python3dist-pybeam"

RDEPENDS:${PN} += "python-abi \
python311-construct \
python311-six"

inherit rpm
