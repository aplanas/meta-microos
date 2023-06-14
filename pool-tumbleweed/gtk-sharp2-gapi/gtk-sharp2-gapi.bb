SUMMARY = "C Source Parser and C Generator"
DESCRIPTION = "The gtk-sharp-gapi package includes the parser and code generator used \
by the GTK if you want to bind GObject-based libraries, or need to \
compile a project that uses it to bind such a library."
LICENSE = "GPL-2.0-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-gapi-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "d1d86ec19fd8fff582a9f161f2501f82ab9d1f57978d46f241d9fce56409d9d247e14a5cc251d02ac775aaa2641ff61dffc1cee96282c0a42b895feabcb98393"

RPROVIDES:${PN} += "gtk-sharp2-gapi \
mono-gapi-codegen \
mono-gapi-fixup \
mono-gapi-parser \
pkgconfig-gapi-2.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/pkg-config \
mono-System.Xml \
mono-mscorlib \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX"

inherit rpm
