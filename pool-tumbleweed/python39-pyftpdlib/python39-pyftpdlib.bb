SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python39-pyftpdlib-1.5.7-2.3.noarch.rpm"
RPM_HASH = "5daca582158d8547d48082f0156dad99c088cf81fa7771ab294b47759852d1dadbab5c5b8a62bed7c67845684f9f17bb6583fe8205650cbc8aa007009b897fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyftpdlib \
python39-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyOpenSSL \
update-alternatives"

inherit rpm
