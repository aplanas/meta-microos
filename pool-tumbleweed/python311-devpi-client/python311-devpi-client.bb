SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.5"

RPM_NAME = "python311-devpi-client-6.0.5-1.1.noarch.rpm"
RPM_HASH = "71752ba2e29b840f001ceac716762e2d036c78326aa24e4e4c6307736a0dfeb03221d3b9fd3439dd4cecc503d958d162a9645b362eaf3d4f532780e89d49ea19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-client \
python3.11dist-devpi-client \
python311-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-build \
python311-check-manifest \
python311-devpi-common \
python311-iniconfig \
python311-pkginfo \
python311-platformdirs \
python311-pluggy \
python311-py \
python311-tox \
python311-wheel \
update-alternatives"

inherit rpm
