SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-setuptools-declarative-requirements-1.2.0-2.3.noarch.rpm"
RPM_HASH = "f8efc696ab5b51e1cd7a0ef18661a9446a5041cc285b939b2807d3497206f939e99a4df44752b66d7590206075a4ae77c917ec4d0574fad8d589115d4208210d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-declarative-requirements \
python39-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-toml \
python39-wheel"

inherit rpm
