SUMMARY = "[ DEPRECATED!! ] Object interface for AF_INET/AF_INET6 domain sockets"
DESCRIPTION = "'IO::Socket::INET6' provides an object interface to creating and using \
sockets in either AF_INET or AF_INET6 domains. It is built upon the \
IO::Socket interface and inherits all the methods defined by IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.73"

RPM_NAME = "perl-IO-Socket-INET6-2.73-1.2.noarch.rpm"
RPM_HASH = "d8f7910ccfa50049497f97efa3df1d9d6e15268b7ea53757453338ad4bc619ca14d887829fc2212022b6a1c93dfc45e994f08ca39337d9f584da659af9cd497b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Socket::INET6) \
perl-IO-Socket-INET6"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Socket6)"

inherit rpm
