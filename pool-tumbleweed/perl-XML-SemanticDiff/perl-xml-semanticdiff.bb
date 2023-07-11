SUMMARY = "Perl extension for comparing XML documents"
DESCRIPTION = "XML::SematicDiff provides a way to compare the contents and structure of \
two XML documents. By default, it returns a list of hashrefs where each \
hashref describes a single difference between the two docs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0007"

RPM_NAME = "perl-XML-SemanticDiff-1.0007-1.17.noarch.rpm"
RPM_HASH = "bddd3488a8e4f5c23ad20bc38266cfb4769a35b6e2b8384f63b5dcbbab90409757c598b580937c7ba566f3d3052cdb70c6f4e3aa39763d5b9952bca6dbb3bf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SemanticDiff \
perl-XML--SemanticDiff--BasicHandler \
perl-XML--SemanticDiff--PathFinder \
perl-XML--SemanticDiff--PathFinder--Obj \
perl-XML-SemanticDiff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--Parser"

inherit rpm
