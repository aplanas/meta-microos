SUMMARY = "client and server implementation of XML-RPC protocol"
DESCRIPTION = "XMLRPC::Lite is a Perl modules which provides a simple nterface to the \
XML-RPC protocol both on client and server side. Based on SOAP::Lite \
module, it gives you access to all features and transports available in \
that module. \
 \
See _t/26-xmlrpc.t_ for client examples and _examples/XMLRPC/*_ for server \
implementations."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.717"

RPM_NAME = "perl-XMLRPC-Lite-0.717-1.21.noarch.rpm"
RPM_HASH = "775edd7d64acfe75f91b90d7a09024f7d8ef192a755d46e135c0617d75ae18fde8ea090a82f4a0a4bca52652949d35dac40649413130a655433a50a7d4b84e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--XMLRPC--Lite \
perl-My--PingPong \
perl-XMLRPC \
perl-XMLRPC--Constants \
perl-XMLRPC--Data \
perl-XMLRPC--Deserializer \
perl-XMLRPC--Lite \
perl-XMLRPC--SOM \
perl-XMLRPC--Serializer \
perl-XMLRPC--Server \
perl-XMLRPC--Server--Parameters \
perl-XMLRPC--Test \
perl-XMLRPC--Test--Server \
perl-XMLRPC--Transport--HTTP \
perl-XMLRPC--Transport--HTTP--Apache \
perl-XMLRPC--Transport--HTTP--CGI \
perl-XMLRPC--Transport--HTTP--Daemon \
perl-XMLRPC--Transport--POP3 \
perl-XMLRPC--Transport--POP3--Server \
perl-XMLRPC--Transport--TCP \
perl-XMLRPC--Transport--TCP--Server \
perl-XMLRPC-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-SOAP--Lite \
perl-SOAP--Transport--TCP"

inherit rpm
