SUMMARY = "[ DEPRECATED!! ] Object interface for AF_INET/AF_INET6 domain sockets"
DESCRIPTION = "'IO::Socket::INET6' provides an object interface to creating and using \
sockets in either AF_INET or AF_INET6 domains. It is built upon the \
IO::Socket interface and inherits all the methods defined by IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.73"

RPM_NAME = "perl-IO-Socket-INET6-2.73-1.4.noarch.rpm"
RPM_HASH = "c6a4711b40365080585bd13efb3aec84641fc9351c50eb0785141bd632e2e257f4721b5518083a0e2afe5119840c536f5c43f166f037477c749478641f1768ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--INET6 \
perl-IO-Socket-INET6"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Socket6"

inherit rpm
