SUMMARY = "Parse informal natural language date/time strings"
DESCRIPTION = "'DateTime::Format::Natural' parses informal natural language date/time \
strings. In addition, parsable date/time substrings may be extracted from \
ordinary strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.17"

RPM_NAME = "perl-DateTime-Format-Natural-1.17-1.2.noarch.rpm"
RPM_HASH = "ec0c38fcee08c4a3c6c7031b6326fa5dad88601e6e7cdb736fccdd6aab8e733d2b6f063c403e070af55b4902e62d98a46bd7b0c94719c8a9daa141b683501b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Natural \
perl-DateTime--Format--Natural--Calc \
perl-DateTime--Format--Natural--Compat \
perl-DateTime--Format--Natural--Duration \
perl-DateTime--Format--Natural--Duration--Checks \
perl-DateTime--Format--Natural--Expand \
perl-DateTime--Format--Natural--Extract \
perl-DateTime--Format--Natural--Formatted \
perl-DateTime--Format--Natural--Helpers \
perl-DateTime--Format--Natural--Lang--Base \
perl-DateTime--Format--Natural--Lang--EN \
perl-DateTime--Format--Natural--Rewrite \
perl-DateTime--Format--Natural--Test \
perl-DateTime--Format--Natural--Utils \
perl-DateTime--Format--Natural--Wrappers \
perl-DateTime-Format-Natural"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Clone \
perl-DateTime \
perl-DateTime--HiRes \
perl-DateTime--TimeZone \
perl-List--MoreUtils \
perl-Params--Validate \
perl-boolean"

inherit rpm
