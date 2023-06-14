SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python310-pyftpdlib-1.5.7-2.1.noarch.rpm"
RPM_HASH = "931c0bd1c4117efd1d8663926770237950445b09a1b80041425e8b2d0e1528829359e94dd0dbf1b39e41bbd693cce3ec4ca1689e294edd0dbac82342268f3aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyftpdlib \
python3.10dist-pyftpdlib \
python310-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-pyOpenSSL \
update-alternatives"

inherit rpm
