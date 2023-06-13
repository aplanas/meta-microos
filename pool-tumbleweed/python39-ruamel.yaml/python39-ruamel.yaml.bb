SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python39-ruamel.yaml-0.17.31-1.1.noarch.rpm"
RPM_HASH = "53b311f14f71e4dd73671fbdd9c742074c3711389428b2367abbad3e59e235b41b7653e4bf176b58fd0185031bed7dc49e55bfb59273083261b79e4550777aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ruamel.yaml) \
python39-ruamel.yaml \
python3dist(ruamel.yaml)"

RDEPENDS:${PN} += "python(abi) \
python39-ruamel.yaml.clib"

inherit rpm
