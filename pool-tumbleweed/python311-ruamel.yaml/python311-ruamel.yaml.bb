SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python311-ruamel.yaml-0.17.31-1.2.noarch.rpm"
RPM_HASH = "4c4f96e75bdee110c3b5bf54a1ad423b0913ac13577aa5dc87c5157f0666b24886ab0dc776bf8646ebee6b994af5e951a1fe3a619f2d9cfab1f9679abbbff440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml \
python3.11dist-ruamel.yaml \
python311-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python311-ruamel.yaml.clib"

inherit rpm
