SUMMARY = "Upload things to the CPAN"
DESCRIPTION = "upload things to the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.103018"

RPM_NAME = "perl-CPAN-Uploader-0.103018-1.2.noarch.rpm"
RPM_HASH = "a4224fed106f12aacd96f69f33693ad54117449d714ad4d306884ffb27607f39c9f96734e8ce905362d20dec227279c23ddb0d6af4031ba305b501bb289bddde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Uploader \
perl-CPAN-Uploader"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long--Descriptive \
perl-HTTP--Request--Common \
perl-HTTP--Status \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Term--ReadKey"

inherit rpm
