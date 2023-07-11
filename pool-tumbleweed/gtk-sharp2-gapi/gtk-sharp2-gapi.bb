SUMMARY = "C Source Parser and C Generator"
DESCRIPTION = "The gtk-sharp-gapi package includes the parser and code generator used \
by the GTK if you want to bind GObject-based libraries, or need to \
compile a project that uses it to bind such a library."
LICENSE = "GPL-2.0-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-gapi-2.12.45-3.9.aarch64.rpm"
RPM_HASH = "b3f7d1453b5af1bde2d8961c977be2fa0d36ed70ddc09cb52fcde8bd9d6b7d030b51f0fb3438d5636169d40a0d72a3c1c276b9ca0bf51741c78af48780e68d33"

RPROVIDES:${PN} += "gtk-sharp2-gapi \
mono-gapi-codegen \
mono-gapi-fixup \
mono-gapi-parser \
pkgconfig-gapi-2.0"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
mono-System.Xml \
mono-mscorlib \
perl-XML-LibXML \
perl-XML-LibXML-Common \
perl-XML-SAX"

inherit rpm
