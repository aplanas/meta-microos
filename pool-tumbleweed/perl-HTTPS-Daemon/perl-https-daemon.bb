SUMMARY = "a simple http server class with SSL support"
DESCRIPTION = "HTTP::Daemon::SSL is a descendant of HTTP::Daemon that uses SSL sockets \
(via IO::Socket::SSL) instead of cleartext sockets.  It also handles \
SSL-specific problems, such as dealing with HTTP clients that attempt \
to connect to it without using SSL."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-HTTPS-Daemon-1.04-70.31.aarch64.rpm"
RPM_HASH = "09873f699951cb00747baef26d58613236a4907d0b2d58832e67df0ae81dfb8e0cac6aff273b8ff43094739d1bc5f41bd982e7bf1b49dae7fba0b5020e158983"

RPROVIDES:${PN} += "perl-HTTP--Daemon--ClientConn--SSL \
perl-HTTP--Daemon--SSL \
perl-HTTP--Daemon--SSL--DummyDaemon \
perl-HTTPS-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO-Socket-SSL \
perl-libwww-perl"

inherit rpm
