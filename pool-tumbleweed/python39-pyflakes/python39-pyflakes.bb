SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-pyflakes-3.1.0-1.1.noarch.rpm"
RPM_HASH = "d91d66d95c5d7244d8d29d8237798a4f89a187fc7f0d2f0e09550b2960b3fc3ff7e47eb22d0195a3d04cfa9a2cf95f678fad74be84d5c2c5280b2bf2c1b802f8"
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
