SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python311-pyftpdlib-1.5.7-2.3.noarch.rpm"
RPM_HASH = "f6689df16f81bf8ea7abc97a63ff448090c7ed3790296983ff864c800d45564d9f3edfe60e560d73a733b2bb4af34c22f82a1ab9a19e5a4f448623731fd843a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyftpdlib \
python3.11dist-pyftpdlib \
python311-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyOpenSSL \
update-alternatives"

inherit rpm
