SUMMARY = "Simple API for XML"
DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.02"

RPM_NAME = "perl-XML-SAX-1.02-1.15.noarch.rpm"
RPM_HASH = "999ac5c2f6c15aa8df71bc4f194d8d4c6e2e28e4ecc33e5c180f1ea0683cbc4be64d6c635c410b90962c1a1449410cc1e5ad8852134d6665cd04948f88966f4f"
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
perl--MODULE-COMPAT-5.36.0 \
perl-XML--NamespaceSupport \
perl-XML--SAX--Base"

inherit rpm
