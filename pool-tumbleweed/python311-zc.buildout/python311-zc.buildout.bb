SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python311-zc.buildout-3.0.1-1.4.noarch.rpm"
RPM_HASH = "1612fcd4cd9cd5f6b236cd40549a5b033ef756b2d35708bb0177c7be6cf98a5cc8949aaafb5b08f831062ca50c2488e14c8f245a0f07d92923b466271b0a4bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zc.buildout \
python311-zc-buildout \
python311-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
