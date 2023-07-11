SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-tomli-2.0.1-2.3.noarch.rpm"
RPM_HASH = "b6a96c4579935ae627afdfaee3d0e77f7b4df108d33de029fed43e92e1b8f9ae696c06e7ef00a51a54dbd870c8dbb8dfb04928bd88ca697359cd54fc2f89d87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tomli \
python39-tomli \
python3dist-tomli"

RDEPENDS:${PN} += "python-abi"

inherit rpm
