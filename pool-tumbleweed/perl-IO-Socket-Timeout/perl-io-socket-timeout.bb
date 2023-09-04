SUMMARY = "IO::Socket with read/write timeout"
DESCRIPTION = "'IO::Socket' provides a way to set a timeout on the socket, but the timeout \
will be used only for connection, not for reading / writing operations. \
 \
This module provides a way to set a timeout on read / write operations on \
an 'IO::Socket' instance, or any 'IO::Socket::*' modules, like \
'IO::Socket::INET'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-IO-Socket-Timeout-0.32-1.25.noarch.rpm"
RPM_HASH = "1a16114e1294dabf242c46d55f3eaa5f26c8a282ca163ec3857aa11821b4bbbe0c3d736512e7d4830d22b6116360818ddb2f3fd83767c5ae0f96f163c27cf05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--Timeout \
perl-IO--Socket--Timeout--Role--PerlIO \
perl-IO--Socket--Timeout--Role--SetSockOpt \
perl-IO-Socket-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-PerlIO--via--Timeout"

inherit rpm
