SUMMARY = "Documentation for python-paramiko"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too. \
 \
This package contains the documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python-paramiko-doc-3.1.0-1.1.noarch.rpm"
RPM_HASH = "afcace68102a2d3fce5d23b35ca4ffa8c0dd4aeb7508a130ca6248c7e4c9637f1ecafd4ceb7a8c264dcf6a8af58f3982172ed03bc2ed084873c98d68322688a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-paramiko-doc \
python310-paramiko-doc \
python311-paramiko-doc \
python39-paramiko-doc"

RDEPENDS:${PN} += ""

inherit rpm
