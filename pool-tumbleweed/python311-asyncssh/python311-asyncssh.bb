SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.2"

RPM_NAME = "python311-asyncssh-2.13.2-1.1.noarch.rpm"
RPM_HASH = "db3cb26ba34f95bec7a3f24db5316d41ca2646fe123b8b14a4579a6fee10d87f29a4c13f4fe460ffd6a7bcf5441e3dfed23a4bdf961dc69153fd9ae8b9a720ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncssh \
python3.11dist-asyncssh \
python311-asyncssh \
python3dist-asyncssh"

RDEPENDS:${PN} += "python-abi \
python311-bcrypt \
python311-cryptography \
python311-gssapi \
python311-libnacl \
python311-pyOpenSSL"

inherit rpm
