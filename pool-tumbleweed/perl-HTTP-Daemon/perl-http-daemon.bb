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

RPM_NAME = "perl-HTTP-Daemon-6.16-1.3.noarch.rpm"
RPM_HASH = "a0c9eb4fffcd557fa0cda7b450b637e7e948e88c558584f643280eada805cc8d3007d94f460f941e2ce08645640617d1c0cf46dece76c638b2bb1c262488dbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Daemon \
perl-HTTP-Daemon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Date \
perl-HTTP--Request \
perl-HTTP--Response \
perl-HTTP--Status \
perl-IO--Socket--IP \
perl-LWP--MediaTypes"

inherit rpm
