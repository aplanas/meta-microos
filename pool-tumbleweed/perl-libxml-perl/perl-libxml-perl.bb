SUMMARY = "Collection of Perl modules for working with XML"
DESCRIPTION = "perl-libxml-perl is a collection of Perl modules for working with XML. \
 \
 \
 \
Authors: \
-------- \
    Ken MacLeod <ken@bitsko.slc.ut.us>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.08"

RPM_NAME = "perl-libxml-perl-0.08-159.31.aarch64.rpm"
RPM_HASH = "48224bc4ebc9f34d3988ce1fa7fa41a0ad13fec4cdad9fc338fbba5be5ed20793a2ac2c4492f50978d573b60fde339aa2d1524769dfdcba4d629fb21eef644b5"

RPROVIDES:${PN} += "perl-Data--Grove \
perl-Data--Grove--Characters \
perl-Data--Grove--Parent \
perl-Data--Grove--ParentList \
perl-Data--Grove--Visitor \
perl-XML--ESISParser \
perl-XML--Handler--CanonXMLWriter \
perl-XML--Handler--Sample \
perl-XML--Handler--Subs \
perl-XML--Handler--XMLWriter \
perl-XML--Parser--PerlSAX \
perl-XML--PatAct--ACTION \
perl-XML--PatAct--Amsterdam \
perl-XML--PatAct--MatchName \
perl-XML--PatAct--PATTERN \
perl-XML--PatAct--ToObjects \
perl-XML--Perl2SAX \
perl-XML--SAX2Perl \
perl-libxml-perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML-Parser"

inherit rpm
