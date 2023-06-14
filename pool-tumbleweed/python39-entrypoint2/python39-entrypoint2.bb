SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python39-entrypoint2-1.1-1.3.noarch.rpm"
RPM_HASH = "29434bdaeaeaa2dc7b1a5eeedc95d00f150481b6a8ab8184cfa277b9dedf09178b5f4936ca2f13a7d3c5c98abf4db71bad1066a403e077aae46e38e1630d18d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-entrypoint2 \
python39-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python39-EasyProcess \
python39-decorator \
python39-path.py"

inherit rpm
