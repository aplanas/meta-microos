SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python311-catkin-pkg-0.4.24-2.11.noarch.rpm"
RPM_HASH = "59931b595d82f77f8c48b3580dfe221b9032c4f4684d67226fa818baa120b2fd7044e383a248dbc5e647b12d9f566bf326e7aacbed5824920f4434d7eb922185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-catkin-pkg \
python3.11dist-catkin-pkg \
python311-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-pyparsing \
python311-python-dateutil \
python311-setuptools \
update-alternatives"

inherit rpm
