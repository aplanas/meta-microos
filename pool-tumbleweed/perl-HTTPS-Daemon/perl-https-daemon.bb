SUMMARY = "a simple http server class with SSL support"
DESCRIPTION = "HTTP::Daemon::SSL is a descendant of HTTP::Daemon that uses SSL sockets \
(via IO::Socket::SSL) instead of cleartext sockets.  It also handles \
SSL-specific problems, such as dealing with HTTP clients that attempt \
to connect to it without using SSL."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-HTTPS-Daemon-1.04-70.30.aarch64.rpm"
RPM_HASH = "a8e1cb16ae04a6d448220e2cc65b7710e06bf034cb1561b15391f05b8c6f1f6abfceb36b45a1d053c6382de77e4119c217b709c1fa0b2dd3e4dc1769b7e47f92"

RPROVIDES:${PN} += "perl-HTTP--Daemon--ClientConn--SSL \
perl-HTTP--Daemon--SSL \
perl-HTTP--Daemon--SSL--DummyDaemon \
perl-HTTPS-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO-Socket-SSL \
perl-libwww-perl"

inherit rpm
