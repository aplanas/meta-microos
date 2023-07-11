SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-pecan-1.4.2-3.3.noarch.rpm"
RPM_HASH = "20051dfd35989180beb53e9697af2333c3c1f50a00a957df0b232c8248fc9b8d780b0a7776a9f816b24a9bf8681754e6b56bc0b06f97e25d551896111261488c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pecan \
python39-pecan \
python3dist-pecan"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-Mako \
python39-WebOb \
python39-WebTest \
python39-logutils \
python39-setuptools"

inherit rpm
