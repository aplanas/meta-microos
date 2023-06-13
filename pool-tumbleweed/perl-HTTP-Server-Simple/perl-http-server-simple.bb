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

RPM_NAME = "perl-HTTP-Server-Simple-0.52-1.23.noarch.rpm"
RPM_HASH = "6330a0fd9bbabb5cbb26adee5322bfbc2772ad897fda64c707df595d43aee3ba63b474bbb9b99230edb15c48b70a286841294da2fe741735558414c8cdd13947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Server::Simple) \
perl(HTTP::Server::Simple::CGI) \
perl(HTTP::Server::Simple::CGI::Environment) \
perl-HTTP-Server-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CGI) \
perl(Socket)"

inherit rpm
