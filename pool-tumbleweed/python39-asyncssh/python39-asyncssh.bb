SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "python39-asyncssh-2.13.1-1.2.noarch.rpm"
RPM_HASH = "8ca901f881e4a81a8d250ef9f3099c7c44ac47c743b0fe085dcbe39d9cc79beb255ccd3b34b67c4fc030c448040d80f35075e41bd8ddafad252ea4d417085adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asyncssh) \
python39-asyncssh \
python3dist(asyncssh)"
RDEPENDS:${PN} += "python(abi) \
python39-bcrypt \
python39-cryptography \
python39-gssapi \
python39-libnacl \
python39-pyOpenSSL"

inherit rpm
