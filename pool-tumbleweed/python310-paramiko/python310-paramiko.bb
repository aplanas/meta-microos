SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python310-paramiko-3.1.0-1.3.noarch.rpm"
RPM_HASH = "5690c166d95eff4ea60ed8b9cca23d1df2bd151924d03a7cff182a78f7ba8e10d06b8e5032f2a30071d314617c12bf0e37329822d45d9aa2667d8a027ad766d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-paramiko \
python310-paramiko \
python3dist-paramiko"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-bcrypt \
python310-cryptography \
python310-pyasn1"

inherit rpm
