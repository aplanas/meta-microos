SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python310-zc.buildout-3.0.1-1.4.noarch.rpm"
RPM_HASH = "1ec88af9580bf1e7108827ce50141408d8ffbee88e66d5c9925dbdf723b95e6cf6bab2bb35d33ba8394608d2f8084b508b908c5df80553b2e5d2b4340601175e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-buildout \
python3-zc.buildout \
python3.10dist-zc.buildout \
python310-zc-buildout \
python310-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
