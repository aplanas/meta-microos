SUMMARY = "Python module which parses and emits TOML"
DESCRIPTION = "Python toml allows to parse and create toml configuration files. \
See below the toml specification link. \
 \
Usage \
toml.loads --- takes a string to be parsed as toml and returns \
the corresponding dictionary \
toml.dumps --- takes a dictionary and returns a string which \
is the contents of the corresponding toml file. \
 \
There are other functions which can be used to dump and load various \
fragments of toml but dumps and loads will cover most usage. \
 \
Current Version of TOML Specification \
https://github.com/mojombo/toml/blob/v0.4.0/README.md"
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python39-toml-0.10.2-3.2.noarch.rpm"
RPM_HASH = "fc07ebef75ed1a06b1d6e0e0051398524626200bb1893ab6be47766fecf97fe22f41206adacdcfdcf1ce8fa01c570e44f24b70a7d9226f55a1ae880f2fecc5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-toml \
python39-toml \
python3dist-toml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
