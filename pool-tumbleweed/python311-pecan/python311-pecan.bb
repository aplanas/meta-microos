SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python311-pecan-1.4.2-3.3.noarch.rpm"
RPM_HASH = "2db7511ecf3579a110dc2cb83c82fe08ddd459d467670f23bab3f873ea1626ba6ea4156f5a69503f24679b3e4d3c63e90f7b69f59c3dbd55859ea6aede401c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pecan \
python3.11dist-pecan \
python311-pecan \
python3dist-pecan"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-Mako \
python311-WebOb \
python311-WebTest \
python311-logutils \
python311-setuptools"

inherit rpm
