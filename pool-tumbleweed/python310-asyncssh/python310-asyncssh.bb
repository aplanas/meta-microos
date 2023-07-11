SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.2"

RPM_NAME = "python310-asyncssh-2.13.2-1.1.noarch.rpm"
RPM_HASH = "8abeb767e405e8e8b2b28bf75bd729805cff4ab287147482fb88ae0ce36e55f34e5b3865db4926027d4058182f6fd98caaecb784b528533d9e858190406ebd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asyncssh \
python310-asyncssh \
python3dist-asyncssh"

RDEPENDS:${PN} += "python-abi \
python310-bcrypt \
python310-cryptography \
python310-gssapi \
python310-libnacl \
python310-pyOpenSSL"

inherit rpm
