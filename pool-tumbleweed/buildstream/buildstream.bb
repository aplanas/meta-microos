SUMMARY = "A framework for modelling build pipelines in YAML"
DESCRIPTION = "BuildStream is a flexible and extensible framework for the modelling of \
build and CI pipelines in a declarative YAML format, written in python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.9"

RPM_NAME = "buildstream-1.6.9-1.2.noarch.rpm"
RPM_HASH = "8c5852ab31b7d9920de3677d0f7e073f68036303632aabfb7df453efe866e59e1e9260c9d3978d67a994e9227119997a0565109cc34899b00e2b8a9c9de17b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildstream \
python3.10dist(buildstream) \
python3dist(buildstream)"

RDEPENDS:${PN} += "/usr/bin/python3 \
bubblewrap \
python(abi) \
python3-base \
python3-click \
python3-gobject \
python3-grpcio \
python3-psutil \
python3-ruamel.yaml \
typelib-1_0-OSTree-1_0"

inherit rpm
