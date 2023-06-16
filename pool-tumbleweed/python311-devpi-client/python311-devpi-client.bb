SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.4"

RPM_NAME = "python311-devpi-client-6.0.4-2.1.noarch.rpm"
RPM_HASH = "b26a28389e5aca046028b3012156f9e537d7e1fcce6be5b81a3d639fa0028882db1bf579dc2aa2de2b7f81a5da75a51108f645bcd955aa34d5ecc98c234c0583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-devpi-client \
python311-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-build \
python311-check-manifest \
python311-devpi-common \
python311-pkginfo \
python311-pluggy \
python311-py \
python311-tox \
python311-wheel \
update-alternatives"

inherit rpm
