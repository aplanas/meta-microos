SUMMARY = "a simple http server class with SSL support"
DESCRIPTION = "HTTP::Daemon::SSL is a descendant of HTTP::Daemon that uses SSL sockets \
(via IO::Socket::SSL) instead of cleartext sockets.  It also handles \
SSL-specific problems, such as dealing with HTTP clients that attempt \
to connect to it without using SSL."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-HTTPS-Daemon-1.04-70.29.aarch64.rpm"
RPM_HASH = "d9777270da7cbdd1eef841af8c760ee26c80c696e45121485291fe2a7206b53a84b54f726225a7ce8a88eaf8a15858c56e722bd277e176ee409d4070b638bd3c"

RPROVIDES:${PN} += "perl(HTTP::Daemon::ClientConn::SSL) \
perl(HTTP::Daemon::SSL) \
perl(HTTP::Daemon::SSL::DummyDaemon) \
perl-HTTPS-Daemon \
perl-HTTPS-Daemon(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-IO-Socket-SSL \
perl-libwww-perl"

inherit rpm
