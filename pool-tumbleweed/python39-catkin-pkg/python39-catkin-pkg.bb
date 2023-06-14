SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python39-catkin-pkg-0.4.24-2.9.noarch.rpm"
RPM_HASH = "20a478ff4b9683a108c22bd4976090fdf118de16f87d4dd504947a992b0da73cf6c1eb23967496b039bac78679e81abbb95d673852be22854c068a3a050f54c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-catkin-pkg \
python39-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-docutils \
python39-pyparsing \
python39-python-dateutil \
python39-setuptools \
update-alternatives"

inherit rpm
