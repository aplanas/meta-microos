SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-pybeam-0.7-1.11.noarch.rpm"
RPM_HASH = "6faeae608c82ef83bbde5494ca628822dcbfec25593c68bd7924ae90f0c1eed12efe2baa5d989d75cae430176733139b1fe6e1e7da0fed7b6067f960377da069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pybeam) \
python39-pybeam \
python3dist(pybeam)"

RDEPENDS:${PN} += "python(abi) \
python39-construct \
python39-six"

inherit rpm
