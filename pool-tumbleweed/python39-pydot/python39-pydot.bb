SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-pydot-1.4.2-3.1.noarch.rpm"
RPM_HASH = "8479fa5fe768f3f63da2ca340c1edbc2056a356db5334dfcb5d6c074bfd184fb9bb284b3fb2527034c8fdf63d1295986bfb128bea997a6985a338e8e786720c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydot \
python39-pydot \
python3dist-pydot"

RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python-abi \
python39-pyparsing"

inherit rpm
