SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "6.0.5"

RPM_NAME = "python39-devpi-client-6.0.5-1.1.noarch.rpm"
RPM_HASH = "78a4abbdc34dfae386536e27fb950966e61931bcc885eb44078153c75d9ddcb40570bf6440c08419ddbc1ab622c50c756142af21d127ab6b7b4b018375f2d8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-devpi-client \
python39-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-build \
python39-check-manifest \
python39-devpi-common \
python39-iniconfig \
python39-pkginfo \
python39-platformdirs \
python39-pluggy \
python39-py \
python39-tox \
python39-wheel \
update-alternatives"

inherit rpm
