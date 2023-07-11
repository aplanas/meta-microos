SUMMARY = "Simple API for XML"
DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.02"

RPM_NAME = "perl-XML-SAX-1.02-1.16.noarch.rpm"
RPM_HASH = "31ed160122eede52e7a0ce1ce75f5e8f8e89a064ce0d5085f0fa199d2a4dba273c7a45bc8ce5a943b7cc5766372c90f23ffb56b79504cea8b16659928f0050db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX \
perl-XML--SAX--DocumentLocator \
perl-XML--SAX--ParserFactory \
perl-XML--SAX--PurePerl \
perl-XML--SAX--PurePerl--DebugHandler \
perl-XML--SAX--PurePerl--Exception \
perl-XML--SAX--PurePerl--Productions \
perl-XML--SAX--PurePerl--Reader \
perl-XML--SAX--PurePerl--Reader--Stream \
perl-XML--SAX--PurePerl--Reader--String \
perl-XML--SAX--PurePerl--Reader--URI \
perl-XML-SAX"

RDEPENDS:${PN} += "/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1 \
perl-XML--NamespaceSupport \
perl-XML--SAX--Base"

inherit rpm
