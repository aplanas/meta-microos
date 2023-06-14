SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python310-ruamel.yaml-0.17.31-1.1.noarch.rpm"
RPM_HASH = "0564d42795b965936a7582df30884bba507fafce179e425aaab685eb0b86f918b0c824984895a7fa72c61c3beaa3811177329ed1a7143714065926e66fd819f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml \
python3.10dist-ruamel.yaml \
python310-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python310-ruamel.yaml.clib"

inherit rpm
