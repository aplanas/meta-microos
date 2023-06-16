SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "0.4.24"

RPM_NAME = "python311-catkin-pkg-0.4.24-2.9.noarch.rpm"
RPM_HASH = "331d29797a8b63aabc280bf4025623bec051f467d5219833a97f1dfab61e067d7c83c1f6e47e89923efec97f65148a30d5a23d5fdafcff19e7ebd7f7734e41df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-catkin-pkg \
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
