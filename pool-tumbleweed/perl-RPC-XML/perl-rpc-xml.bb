SUMMARY = "Set of classes for core data, message and XML handling"
DESCRIPTION = "The *RPC::XML* package is an implementation of the *XML-RPC* standard. The \
package as a whole provides classes for data, for clients, for servers and \
for parsers (based on the XML::Parser and XML::LibXML packages from CPAN). \
 \
This module provides a set of classes for creating values to pass to the \
constructors for requests and responses. These are lightweight objects, \
most of which are implemented as blessed scalar references so as to \
associate specific type information with the value. Classes are also \
provided for requests, responses and faults (errors). \
 \
This module does not actually provide any transport implementation or \
server basis. For these, see RPC::XML::Client and RPC::XML::Server, \
respectively."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.82"

RPM_NAME = "perl-RPC-XML-0.82-1.9.noarch.rpm"
RPM_HASH = "579d239649ebf651ee0e045f74f8d74bab7d6535807b7cb86a9e7dfd90eb6b7f59178b73bbcc305a229c34908f7b567c7c7ecbcb814919ee0018032ac32a6477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--RPC--Server \
perl-Apache--RPC--Status \
perl-RPC--XML \
perl-RPC--XML--Client \
perl-RPC--XML--Function \
perl-RPC--XML--Method \
perl-RPC--XML--Parser \
perl-RPC--XML--Parser--XMLLibXML \
perl-RPC--XML--Parser--XMLParser \
perl-RPC--XML--ParserFactory \
perl-RPC--XML--Procedure \
perl-RPC--XML--Server \
perl-RPC--XML--array \
perl-RPC--XML--base64 \
perl-RPC--XML--boolean \
perl-RPC--XML--datatype \
perl-RPC--XML--datetime-iso8601 \
perl-RPC--XML--double \
perl-RPC--XML--fault \
perl-RPC--XML--i4 \
perl-RPC--XML--i8 \
perl-RPC--XML--int \
perl-RPC--XML--nil \
perl-RPC--XML--request \
perl-RPC--XML--response \
perl-RPC--XML--simple-type \
perl-RPC--XML--string \
perl-RPC--XML--struct \
perl-RPC-XML"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Daemon \
perl-HTTP--Message \
perl-LWP \
perl-Module--Load \
perl-Scalar--Util \
perl-XML--Parser"

inherit rpm
