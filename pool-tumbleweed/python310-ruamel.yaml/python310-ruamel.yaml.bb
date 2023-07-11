SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.31"

RPM_NAME = "python310-ruamel.yaml-0.17.31-1.2.noarch.rpm"
RPM_HASH = "c80cb8a61a31cd6762d5618be61a2bef433b907cf12be596075b0dfcd9a2d903b4bf427db61021a5c23bba9d75865cbadfa2485acb94338fe7906d55f98ed59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ruamel.yaml \
python310-ruamel.yaml \
python3dist-ruamel.yaml"

RDEPENDS:${PN} += "python-abi \
python310-ruamel.yaml.clib"

inherit rpm
