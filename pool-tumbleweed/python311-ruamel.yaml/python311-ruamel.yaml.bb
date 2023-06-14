SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python311-ruamel.yaml-0.17.31-1.1.noarch.rpm"
RPM_HASH = "aaf1dcfbb45df287e44a254a51196f57cd68f6a9cff1ffb0e79d1e3d49d8ebcabb36c3f9965122cbadc4fe9ceaf2992d1ff83598a61b35398bd1597bb6541e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ruamel.yaml \
python311-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python311-ruamel.yaml.clib"

inherit rpm
