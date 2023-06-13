SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-pecan-1.4.2-3.1.noarch.rpm"
RPM_HASH = "9779a58003f457bda735bd8481b82cc126d837c9d8865865cbb35892c0e2cee25628ec69adf27911fbf60ad2f2e9509c626a544915cc428151e6a47da0b2abe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pecan) \
python39-pecan \
python3dist(pecan)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-Mako \
python39-WebOb \
python39-WebTest \
python39-logutils \
python39-setuptools"

inherit rpm
