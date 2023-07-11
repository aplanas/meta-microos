SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python311-zc.buildout-3.0.1-1.5.noarch.rpm"
RPM_HASH = "0450bc144e3de02037dacbbca50104280e2446245320fa8b51abf0ef5d8a61d966b1e17ff8348ac67db95ab3f8d6d3010387fc3a45ecc2f601ff5314ed25b8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-buildout \
python3-zc.buildout \
python3.11dist-zc.buildout \
python311-zc-buildout \
python311-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
