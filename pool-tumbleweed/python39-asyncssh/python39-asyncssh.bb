SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.2"

RPM_NAME = "python39-asyncssh-2.13.2-1.1.noarch.rpm"
RPM_HASH = "5d97f38126190561720d548583a91bd49e925534f12d322d18661f705b99c3ce676d64041b75e638c1dcabff810711b3ffa6684a24c816407515f196ba4913a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asyncssh \
python39-asyncssh \
python3dist-asyncssh"

RDEPENDS:${PN} += "python-abi \
python39-bcrypt \
python39-cryptography \
python39-gssapi \
python39-libnacl \
python39-pyOpenSSL"

inherit rpm
