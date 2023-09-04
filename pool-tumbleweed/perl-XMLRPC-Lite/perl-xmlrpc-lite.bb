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

RPM_NAME = "perl-XMLRPC-Lite-0.717-1.22.noarch.rpm"
RPM_HASH = "fada440c27f1945c30257cc00473a2cb6be676b6f71fdffe2924c3d01870b7c515e039622873d6862217409f869aa3f9b5d096684e94785bc4c715b177e3643e"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-SOAP--Lite \
perl-SOAP--Transport--TCP"

inherit rpm
