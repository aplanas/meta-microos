SUMMARY = "Perl extension for comparing XML documents"
DESCRIPTION = "XML::SematicDiff provides a way to compare the contents and structure of \
two XML documents. By default, it returns a list of hashrefs where each \
hashref describes a single difference between the two docs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0007"

RPM_NAME = "perl-XML-SemanticDiff-1.0007-1.18.noarch.rpm"
RPM_HASH = "fb3e430c65e808ee3a9a16e89ebe3beb988a6dd01086583a206186397f4349228c4720900c0118c6775bd79df8609c584fb0a34d20f8dd39b3ac4218de46a00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SemanticDiff \
perl-XML--SemanticDiff--BasicHandler \
perl-XML--SemanticDiff--PathFinder \
perl-XML--SemanticDiff--PathFinder--Obj \
perl-XML-SemanticDiff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--Parser"

inherit rpm
