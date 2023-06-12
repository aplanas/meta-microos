SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python39-paramiko-3.1.0-1.1.noarch.rpm"
RPM_HASH = "dfc887f39dc1aee49b322d8b23696051710567d467adb1675891fe38b2a91044cf4174100757349831221a0cd08e3563b4c59955b910721ad6057364fdc32ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paramiko) \
python39-paramiko \
python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) \
python39-PyNaCl \
python39-bcrypt \
python39-cryptography \
python39-pyasn1"

inherit rpm
