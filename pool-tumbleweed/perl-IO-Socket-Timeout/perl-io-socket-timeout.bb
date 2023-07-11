SUMMARY = "IO::Socket with read/write timeout"
DESCRIPTION = "'IO::Socket' provides a way to set a timeout on the socket, but the timeout \
will be used only for connection, not for reading / writing operations. \
 \
This module provides a way to set a timeout on read / write operations on \
an 'IO::Socket' instance, or any 'IO::Socket::*' modules, like \
'IO::Socket::INET'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-IO-Socket-Timeout-0.32-1.24.noarch.rpm"
RPM_HASH = "ebe1ba0fff0e01e07a244b86bbe7b7c6e72145a048302fa533d0ac0a6e8681385a9a9bc7c69cef5607c32120e479237f25e47cb5e4b515e122ea4e1fa6c1b56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--Timeout \
perl-IO--Socket--Timeout--Role--PerlIO \
perl-IO--Socket--Timeout--Role--SetSockOpt \
perl-IO-Socket-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-PerlIO--via--Timeout"

inherit rpm
