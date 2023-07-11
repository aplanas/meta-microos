SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-pydot-1.4.2-3.1.noarch.rpm"
RPM_HASH = "58ddbba3d31ed9ae6cf9d8596ee2ceae759603959d8fdb5ec41f03f210fdb126663532ca1e84d45cfc8989c8fcdd275afb7c33f90608f13ede8b2d41232382c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydot \
python3.11dist-pydot \
python311-pydot \
python3dist-pydot"

RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python-abi \
python311-pyparsing"

inherit rpm
