SUMMARY = "[ DEPRECATED!! ] Object interface for AF_INET/AF_INET6 domain sockets"
DESCRIPTION = "'IO::Socket::INET6' provides an object interface to creating and using \
sockets in either AF_INET or AF_INET6 domains. It is built upon the \
IO::Socket interface and inherits all the methods defined by IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.73"

RPM_NAME = "perl-IO-Socket-INET6-2.73-1.3.noarch.rpm"
RPM_HASH = "4efe7252d1a4c37d193f30afa3922a73814623b66dd31489e5c59db89ba31f2e00a9e5c6024df666c6be2945f3e89f113f1fe3b0508bd96a98b89242a6c2fe94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--INET6 \
perl-IO-Socket-INET6"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Socket6"

inherit rpm
