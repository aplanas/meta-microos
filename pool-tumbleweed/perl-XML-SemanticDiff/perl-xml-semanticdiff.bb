SUMMARY = "Perl extension for comparing XML documents"
DESCRIPTION = "XML::SematicDiff provides a way to compare the contents and structure of \
two XML documents. By default, it returns a list of hashrefs where each \
hashref describes a single difference between the two docs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0007"

RPM_NAME = "perl-XML-SemanticDiff-1.0007-1.16.noarch.rpm"
RPM_HASH = "742a5705949864490cecc797d767c52cf05ec2be9f618ea45297112b5da2d6fe861298aeb0765dff07410aad5438bbd84d9e7e53117a711756faeb0cc3734ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SemanticDiff \
perl-XML--SemanticDiff--BasicHandler \
perl-XML--SemanticDiff--PathFinder \
perl-XML--SemanticDiff--PathFinder--Obj \
perl-XML-SemanticDiff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-XML--Parser"

inherit rpm
