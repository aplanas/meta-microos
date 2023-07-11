SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python39-paramiko-3.1.0-1.3.noarch.rpm"
RPM_HASH = "70e8250e5f475056af7dbe019a038233e5f1ec8db47d1dbdf1080b36f526248b15af029f3c31e30f64319068522c3f2a54dbfe07841d86f25e3cff87a94e285a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-paramiko \
python39-paramiko \
python3dist-paramiko"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-bcrypt \
python39-cryptography \
python39-pyasn1"

inherit rpm
