SUMMARY = "Perl's Web Services Toolkit"
DESCRIPTION = "SOAP::Lite is a collection of Perl modules which provides a simple and \
lightweight interface to the Simple Object Access Protocol (SOAP) both on \
client and server side."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & CC-BY-ND-2.0"

PV = "1.27"

RPM_NAME = "perl-SOAP-Lite-1.27-3.11.noarch.rpm"
RPM_HASH = "a43a1c019b0d38f1482fcfe15e52eee4c7d43f38328601803b27a8135cff54b1670c4972e55de7dec152114f57a459e607c85f808f08dc2633dd03801a8afb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--SOAP \
perl-SOAP \
perl-SOAP--Client \
perl-SOAP--Cloneable \
perl-SOAP--Constants \
perl-SOAP--Custom--XML--Data \
perl-SOAP--Custom--XML--Deserializer \
perl-SOAP--Data \
perl-SOAP--Deserializer \
perl-SOAP--Fault \
perl-SOAP--Header \
perl-SOAP--Lite \
perl-SOAP--Lite--COM \
perl-SOAP--Lite--Deserializer--XMLSchema1999 \
perl-SOAP--Lite--Deserializer--XMLSchema2001 \
perl-SOAP--Lite--Deserializer--XMLSchemaSOAP1-1 \
perl-SOAP--Lite--Deserializer--XMLSchemaSOAP1-2 \
perl-SOAP--Lite--Packager \
perl-SOAP--Lite--Packager--DIME \
perl-SOAP--Lite--Packager--MIME \
perl-SOAP--Lite--Utils \
perl-SOAP--Packager \
perl-SOAP--Packager--DIME \
perl-SOAP--Packager--MIME \
perl-SOAP--Parser \
perl-SOAP--SOM \
perl-SOAP--Schema \
perl-SOAP--Schema--Deserializer \
perl-SOAP--Schema--WSDL \
perl-SOAP--Serializer \
perl-SOAP--Server \
perl-SOAP--Server--Object \
perl-SOAP--Server--Parameters \
perl-SOAP--Test \
perl-SOAP--Test--Server \
perl-SOAP--Trace \
perl-SOAP--Transport \
perl-SOAP--Transport--HTTP \
perl-SOAP--Transport--HTTP--Apache \
perl-SOAP--Transport--HTTP--CGI \
perl-SOAP--Transport--HTTP--Client \
perl-SOAP--Transport--HTTP--Daemon \
perl-SOAP--Transport--HTTP--FCGI \
perl-SOAP--Transport--HTTP--Server \
perl-SOAP--Transport--IO \
perl-SOAP--Transport--IO--Server \
perl-SOAP--Transport--LOCAL \
perl-SOAP--Transport--LOCAL--Client \
perl-SOAP--Transport--LOOPBACK \
perl-SOAP--Transport--LOOPBACK--Client \
perl-SOAP--Transport--MAILTO \
perl-SOAP--Transport--MAILTO--Client \
perl-SOAP--Transport--POP3 \
perl-SOAP--Transport--POP3--Server \
perl-SOAP--Transport--TCP \
perl-SOAP--Transport--TCP--Client \
perl-SOAP--Transport--TCP--Server \
perl-SOAP--Utils \
perl-SOAP--XMLSchema--Serializer \
perl-SOAP--XMLSchema1999--Serializer \
perl-SOAP--XMLSchema2001--Serializer \
perl-SOAP--XMLSchemaApacheSOAP--Deserializer \
perl-SOAP-Lite"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Inspector \
perl-Compress--Zlib \
perl-IO--SessionData \
perl-IO--Socket--SSL \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-MIME--Base64 \
perl-Scalar--Util \
perl-Task--Weaken \
perl-URI \
perl-URI--Escape \
perl-XML--Parser \
perl-XML--Parser--Lite \
perl-constant"

inherit rpm
