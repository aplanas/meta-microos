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

RPM_NAME = "perl-libxml-perl-0.08-159.30.aarch64.rpm"
RPM_HASH = "5a6d3be992d639cd1767b94982c94913cb0ec2eaaf26ac76f5b0a83b91639542d780dce404bb3ca2e1a5a7a9d48a92ecc12e5ab16bbbc709ce5f486912d51183"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML-Parser"

inherit rpm
