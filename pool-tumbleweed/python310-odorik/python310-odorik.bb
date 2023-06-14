SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python310-odorik-0.5-6.4.noarch.rpm"
RPM_HASH = "2d49a7aa9bf94e6bbfd0c83f59f16109f729fb9acb89841cd5634764fd4b25004bfee3b92f194f5ae0950a7b0d24c7ed47872964fcc3c2fcbd6398d0477f72de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-odorik \
python3.10dist-odorik \
python310-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-python-dateutil \
python310-xdg \
update-alternatives"

inherit rpm
