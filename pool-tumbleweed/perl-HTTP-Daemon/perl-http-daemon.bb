SUMMARY = "Simple http server class"
DESCRIPTION = "Instances of the 'HTTP::Daemon' class are HTTP/1.1 servers that listen on a \
socket for incoming requests. The 'HTTP::Daemon' is a subclass of \
'IO::Socket::IP', so you can perform socket operations directly on it too. \
 \
Please note that 'HTTP::Daemon' used to be a subclass of \
'IO::Socket::INET'. To support IPv6, it switched the parent class to \
'IO::Socket::IP' at version 6.05. See IPv6 SUPPORT for details. \
 \
The accept() method will return when a connection from a client is \
available. The returned value will be an 'HTTP::Daemon::ClientConn' object \
which is another 'IO::Socket::IP' subclass. Calling the get_request() \
method on this object will read data from the client and return an \
'HTTP::Request' object. The ClientConn object also provide methods to send \
back various responses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.16"

RPM_NAME = "perl-HTTP-Daemon-6.16-1.1.noarch.rpm"
RPM_HASH = "bf596d914c59a44d3c42abc574f6f715fbb500777c25db0a9f46f331c4960ee5ee275e7dd7a8a2fcea8230e3a1672b8fc109aacafbb2632f4d5d6bbb97ea95e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Daemon \
perl-HTTP-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-HTTP--Date \
perl-HTTP--Request \
perl-HTTP--Response \
perl-HTTP--Status \
perl-IO--Socket--IP \
perl-LWP--MediaTypes"

inherit rpm
