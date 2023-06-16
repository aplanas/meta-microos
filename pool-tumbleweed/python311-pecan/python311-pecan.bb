SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python311-pecan-1.4.2-3.1.noarch.rpm"
RPM_HASH = "4035389ca6993daefa9e10a7ff6bc972719a761b1ddfef710497fb5c71bb2de4dfb7220d36b16a13b6fa61a582664bac44f993f4028e8bd7446fba84b8342929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pecan \
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
