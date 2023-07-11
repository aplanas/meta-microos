SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python310-zc.buildout-3.0.1-1.5.noarch.rpm"
RPM_HASH = "e6dd97440464d8e88200afcaf45fcd42b79d39e31d661f9bf28fe41e3ef2d27779f225b89baf229bab6ff3e6a6e2a9888718911d095366170759b3cce275c6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zc.buildout \
python310-zc-buildout \
python310-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
