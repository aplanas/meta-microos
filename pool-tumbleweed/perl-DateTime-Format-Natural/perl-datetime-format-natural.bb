SUMMARY = "Parse informal natural language date/time strings"
DESCRIPTION = "'DateTime::Format::Natural' parses informal natural language date/time \
strings. In addition, parsable date/time substrings may be extracted from \
ordinary strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-DateTime-Format-Natural-1.16-1.2.noarch.rpm"
RPM_HASH = "e8e5a55746c0588f596df0c80c75dd2e01c714383bcdf87b8b368f7fd5f9a6ee68f5a07bf466fdb3345aebe49c41f64998f0954756d34c76fe856cbfbc51578b"
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
perl--MODULE-COMPAT-5.36.1 \
perl-Clone \
perl-DateTime \
perl-DateTime--HiRes \
perl-DateTime--TimeZone \
perl-List--MoreUtils \
perl-Params--Validate \
perl-boolean"

inherit rpm
