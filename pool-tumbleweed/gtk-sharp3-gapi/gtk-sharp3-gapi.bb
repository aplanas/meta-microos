SUMMARY = "C Source Parser and C Generator"
DESCRIPTION = "The gtk-sharp-gapi package includes the parser and code generator used \
by the GTK if you want to bind GObject-based libraries, or need to \
compile a project that uses it to bind such a library."
LICENSE = "GPL-2.0-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-gapi-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "aee86eae8fe48d4e814dc81abbb3a3c1391a8095a8109e542c134e78f7d7dd1f2edbaeeef9e2a6316b52deded0255a73986c0e9dc2bc9367779f1c53d6ca6658"

RPROVIDES:${PN} += "gtk-sharp3-gapi \
mono-gapi-codegen \
mono-gapi-fixup \
mono-gapi-parser"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
mono-System \
mono-System.Xml \
mono-mscorlib \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX"

inherit rpm
