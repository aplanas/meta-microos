SUMMARY = "Documentation for python-paramiko"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too. \
 \
This package contains the documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python-paramiko-doc-3.1.0-1.3.noarch.rpm"
RPM_HASH = "f20f45bd333b5854d53f5ff5230cb5b273d10a9c6e4661b977319db4dfa59aa386e681f5e4efa48db23c9c8cd8be0f0becc28aca087303e3419ddca482fc980a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-paramiko-doc \
python310-paramiko-doc \
python311-paramiko-doc \
python39-paramiko-doc"

RDEPENDS:${PN} += ""

inherit rpm
