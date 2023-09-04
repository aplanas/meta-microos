SUMMARY = "Perl module for processing XSLT"
DESCRIPTION = "This module implements the W3C's XSLT specification. The goal is full \
implementation of this spec, but we have not yet achieved that. However, it \
already works well. See XML::XSLT Commands for the current status of each \
command. \
 \
XML::XSLT makes use of XML::DOM and LWP::Simple, while XML::DOM uses \
XML::Parser. Therefore XML::Parser, XML::DOM and LWP::Simple have to be \
installed properly for XML::XSLT to run."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.48"

RPM_NAME = "perl-XML-XSLT-0.48-198.15.noarch.rpm"
RPM_HASH = "4e71084150f138874d599e3f0ddf7f9ee2bda591e9f1aa57e52fd6f2789d590a6552743a851fe9254241a342033541dc6ec4954d8a197610f90256074e3ffc48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XSLT \
perl-XML--XSLT--DOM--TextDOE \
perl-XML-XSLT"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-XML--DOM \
perl-XML--Parser"

inherit rpm
