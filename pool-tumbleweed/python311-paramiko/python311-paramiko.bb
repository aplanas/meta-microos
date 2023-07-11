SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python311-paramiko-3.1.0-1.3.noarch.rpm"
RPM_HASH = "f83a3e9be2d72a5e63710a6e6a0487afd7e8490fa57d26358f8440db171cbfb171ce9f2939b75a078457ce2e9e433477cca07f57a462a4a724ae8645a75ee358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko \
python3.11dist-paramiko \
python311-paramiko \
python3dist-paramiko"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-bcrypt \
python311-cryptography \
python311-pyasn1"

inherit rpm
