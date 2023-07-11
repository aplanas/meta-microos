SUMMARY = "Lightweight HTTP server"
DESCRIPTION = "This is a simple standalone HTTP server. By default, it doesn't thread or \
fork. It does, however, act as a simple frontend which can be used to build \
a standalone web-based application or turn a CGI into one. \
 \
It is possible to use Net::Server classes to create forking, pre-forking, \
and other types of more complicated servers; see net_server. \
 \
By default, the server traps a few signals: \
 \
* HUP \
 \
When you 'kill -HUP' the server, it lets the current request finish being \
processed, then uses the 'restart' method to re-exec itself. Please note \
that in order to provide restart-on-SIGHUP, HTTP::Server::Simple sets a \
SIGHUP handler during initialisation. If your request handling code forks \
you need to make sure you reset this or unexpected things will happen if \
somebody sends a HUP to all running processes spawned by your app (e.g. by \
'kill -HUP <script>') \
 \
* PIPE \
 \
If the server detects a broken pipe while writing output to the client, it \
ignores the signal. Otherwise, a client closing the connection early could \
kill the server."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.52"

RPM_NAME = "perl-HTTP-Server-Simple-0.52-1.24.noarch.rpm"
RPM_HASH = "4e2ff45dca109c9db2c1f207d5adcbb2393c9d3324b094d8fe8fc8cdb0fb07c2c8d23dc2212952179a9c377bfd8c71ecdf3f620a31e447f0ece96c14acfecb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Server--Simple \
perl-HTTP--Server--Simple--CGI \
perl-HTTP--Server--Simple--CGI--Environment \
perl-HTTP-Server-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CGI \
perl-Socket"

inherit rpm
