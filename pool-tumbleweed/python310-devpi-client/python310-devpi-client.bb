SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.5"

RPM_NAME = "python310-devpi-client-6.0.5-1.1.noarch.rpm"
RPM_HASH = "ede4773275c03a3458d7aa56c2e6837a15dffc4868c812712f87de7bda9b7701520fead48e0aba4029a849461887bc6bbf9ce4107c22d726ce6a341e8dbe288e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-devpi-client \
python310-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-build \
python310-check-manifest \
python310-devpi-common \
python310-iniconfig \
python310-pkginfo \
python310-platformdirs \
python310-pluggy \
python310-py \
python310-tox \
python310-wheel \
update-alternatives"

inherit rpm
