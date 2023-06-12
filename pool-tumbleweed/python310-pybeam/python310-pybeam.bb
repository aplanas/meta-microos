SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-pybeam-0.7-1.11.noarch.rpm"
RPM_HASH = "b0320044b288372d749d8fe6979380f8344f67a91e9c33fa43e00a0a2df9ab668faf023f5a867333db21665cf956b6fe0984668caa0f13e2db61e4ac03650114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybeam \
python3.10dist(pybeam) \
python310-pybeam \
python3dist(pybeam)"
RDEPENDS:${PN} += "python(abi) \
python310-construct \
python310-six"

inherit rpm
