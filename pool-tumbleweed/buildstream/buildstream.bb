SUMMARY = "A framework for modelling build pipelines in YAML"
DESCRIPTION = "BuildStream is a flexible and extensible framework for the modelling of \
build and CI pipelines in a declarative YAML format, written in python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.9"

RPM_NAME = "buildstream-1.6.9-1.3.noarch.rpm"
RPM_HASH = "fed845ddeeec31ac1e72fb7c544c297161474ffb383763ccfa967a86fea4d00a2d26948801130f93645ed4a66af187b6b9fc5ef5e2274b5143e2352b46e10d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildstream \
python3.11dist-buildstream \
python3dist-buildstream"

RDEPENDS:${PN} += "/usr/bin/python3 \
bubblewrap \
python-abi \
python3-base \
python3-click \
python3-gobject \
python3-grpcio \
python3-psutil \
python3-ruamel.yaml \
typelib-1-0-OSTree-1-0"

inherit rpm
