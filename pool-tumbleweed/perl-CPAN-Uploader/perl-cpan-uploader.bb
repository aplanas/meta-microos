SUMMARY = "Upload things to the CPAN"
DESCRIPTION = "upload things to the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.103018"

RPM_NAME = "perl-CPAN-Uploader-0.103018-1.3.noarch.rpm"
RPM_HASH = "e029a3af33553eabe36982885a61f09c50334894c0154dcd9a18dbadeede49a40d311725dd4c0686291ee05bd962c33ebe34d0c53c9469f361e1192c5b3f5664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Uploader \
perl-CPAN-Uploader"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long--Descriptive \
perl-HTTP--Request--Common \
perl-HTTP--Status \
perl-LWP--Protocol--https \
perl-LWP--UserAgent \
perl-Term--ReadKey"

inherit rpm
