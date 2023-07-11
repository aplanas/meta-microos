SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-pyflakes-3.0.1-4.3.noarch.rpm"
RPM_HASH = "55182f863170750234b7782440f30a26131fa4c78fbd951af75f53dbb33c16976e4ba513a2e96d91971bc4c7d06c6a2ef495cd3f073dd02329aeb6ee57d56760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyflakes \
python39-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
