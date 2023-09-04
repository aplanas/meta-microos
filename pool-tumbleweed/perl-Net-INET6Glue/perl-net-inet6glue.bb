SUMMARY = "Make common modules IPv6 ready by hotpatching"
DESCRIPTION = "Net::INET6Glue is a collection of modules to make common modules IPv6 ready \
by hotpatching them. \
 \
Unfortunatly the current state of IPv6 support in perl is that no IPv6 \
support is in the core and that a lot of important modules (like Net::FTP, \
Net::SMTP, LWP,...) do not support IPv6 even if the modules for IPv6 \
sockets like Socket6, IO::Socket::IP or IO::Socket::INET6 are available. \
 \
This module tries to mitigate this by hotpatching. Currently the following \
submodules are available: \
 \
* Net::INET6Glue::INET_is_INET6 \
 \
Makes IO::Socket::INET behave like IO::Socket::IP (with fallback to like \
IO::Socket::INET6), especially make it capable to create IPv6 sockets. This \
makes LWP, Net::SMTP and others IPv6 capable. \
 \
* Net::INET6Glue::FTP \
 \
Hotpatches Net::FTP to support EPRT and EPSV commands which are needed to \
deal with FTP over IPv6. Also loads Net::INET6Glue::INET_is_INET6."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.604"

RPM_NAME = "perl-Net-INET6Glue-0.604-1.12.noarch.rpm"
RPM_HASH = "3fb40bc610a02b34f2d07361954f07d23d73622d40e0bf93edf14c4ba9cb500b15ffc4831871944ff7adee31b124bb4a84b8cf226090b18e1f3c57a58e5e163e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--INET6Glue \
perl-Net--INET6Glue--FTP \
perl-Net--INET6Glue--INET-is-INET6 \
perl-Net-INET6Glue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--IP"

inherit rpm
