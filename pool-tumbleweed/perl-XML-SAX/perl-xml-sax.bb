SUMMARY = "Simple API for XML"
DESCRIPTION = "XML::SAX is a SAX parser access API for Perl. It includes classes and APIs \
required for implementing SAX drivers, along with a factory class for \
returning any SAX parser installed on the user's system."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.02"

RPM_NAME = "perl-XML-SAX-1.02-1.17.noarch.rpm"
RPM_HASH = "f598d481e3e958f0d5b2399c4e9d21f91546008dad835a79962a7f2c6cac55260dffd77917de0d41272511246a853b9553a55286655fb359cbe68e647b3a9f69"
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
perl--MODULE-COMPAT-5.38.0 \
perl-XML--NamespaceSupport \
perl-XML--SAX--Base"

inherit rpm
