SUMMARY = "Parse informal natural language date/time strings"
DESCRIPTION = "'DateTime::Format::Natural' parses informal natural language date/time \
strings. In addition, parsable date/time substrings may be extracted from \
ordinary strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.17"

RPM_NAME = "perl-DateTime-Format-Natural-1.17-1.1.noarch.rpm"
RPM_HASH = "20a9a14dc78858b2c74af6620f85e94d00da906b89adce14018d8db9b58b77d034595629e9e3735eb108b75ad82ee87c4cbf00e2d6e0f2522eaf936cb58d7049"
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
