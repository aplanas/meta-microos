SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python39-ruamel.yaml-0.17.31-1.2.noarch.rpm"
RPM_HASH = "62314482da98e2c45831022b4f7ef25783023aff40ad915380f43b2f1cd03404af4ca14832a2edd934e21e676b5ac1eb04304f8a1d96b71ba68e2d5754a1a5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruamel.yaml \
python39-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python39-ruamel.yaml.clib"

inherit rpm
