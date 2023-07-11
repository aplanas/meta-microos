SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python310-pyftpdlib-1.5.7-2.3.noarch.rpm"
RPM_HASH = "0d56b2fb3c27c6ff05c2e113ec14a6891a13373af5e6d19408233482c19693e447a393320d9b9d5a4f171c5d867357c077827d077f2de88eedfc329c85c2c618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyftpdlib \
python310-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyOpenSSL \
update-alternatives"

inherit rpm
