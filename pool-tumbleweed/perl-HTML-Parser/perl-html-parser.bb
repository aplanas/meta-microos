SUMMARY = "HTML parser class"
DESCRIPTION = "Objects of the 'HTML::Parser' class will recognize markup and separate it \
from plain text (alias data content) in HTML documents. As different kinds \
of markup and text are recognized, the corresponding event handlers are \
invoked. \
 \
'HTML::Parser' is not a generic SGML parser. We have tried to make it able \
to deal with the HTML that is actually 'out there', and it normally parses \
as closely as possible to the way the popular web browsers do it instead of \
strictly following one of the many HTML specifications from W3C. Where \
there is disagreement, there is often an option that you can enable to get \
the official behaviour. \
 \
The document to be parsed may be supplied in arbitrary chunks. This makes \
on-the-fly parsing as documents are received from the network possible. \
 \
If event driven parsing does not feel right for your application, you might \
want to use 'HTML::PullParser'. This is an 'HTML::Parser' subclass that \
allows a more conventional program structure."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.81"

RPM_NAME = "perl-HTML-Parser-3.81-1.5.aarch64.rpm"
RPM_HASH = "027e81dea3953142f93497aa0ed2ee412e9276413088c932299a0c354b9ac6fcac3edcada58200c79fbdcca5fbb9730095e7a8ee017af86de5fc00edb4dcf3ca"

RPROVIDES:${PN} += "perl-HTML--Entities \
perl-HTML--Filter \
perl-HTML--HeadParser \
perl-HTML--LinkExtor \
perl-HTML--Parser \
perl-HTML--PullParser \
perl-HTML--TokeParser \
perl-HTML-Parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Tagset \
perl-HTTP--Headers \
perl-URI \
perl-URI--URL"

inherit rpm
