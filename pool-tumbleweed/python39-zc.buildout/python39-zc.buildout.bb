SUMMARY = "System for managing development buildouts"
DESCRIPTION = "System for managing development buildouts. \
 \
Buildout is a project designed to solve 2 problems: \
 * Application-centric assembly and deployment \
 * Repeatable assembly of programs from Python software distributions"
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python39-zc.buildout-3.0.1-1.5.noarch.rpm"
RPM_HASH = "796ad3ac773c286b10aa58abf47d83b5f5ba0eb5a9cc78063898943ea20053034d67c17eccfa7c1205d2a20adec6edc034727da79e3a1705273b70cd22579607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zc.buildout \
python39-zc-buildout \
python39-zc.buildout \
python3dist-zc.buildout"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
