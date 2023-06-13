SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python39-zc.buildout-3.0.1-1.4.noarch.rpm"
RPM_HASH = "708f71c451b93d8e812756636bfdd74d6ae5ce0043a924095d3c68a74b4ad772a310fdb8a6770e73907953f6fc743346d8d89aedb72ae3db60ab336f6dc2daa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zc.buildout) \
python39-zc.buildout \
python39-zc_buildout \
python3dist(zc.buildout)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
