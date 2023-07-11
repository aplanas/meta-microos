SUMMARY = "Perl5 module for reading configuration files and parsing command line ar[cut]"
DESCRIPTION = "Perl5 module for reading configuration files and parsing command line arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.71"

RPM_NAME = "perl-AppConfig-1.71-1.28.noarch.rpm"
RPM_HASH = "49d2fa378d475cd5807575c6a8f1ddec2f08718120b7d9889bde1098becb97a54014d03c30d2760145f0cb9ce3433ad2c1f2d5e71439543c000190788d45a913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AppConfig \
perl-AppConfig--Args \
perl-AppConfig--CGI \
perl-AppConfig--File \
perl-AppConfig--Getopt \
perl-AppConfig--State \
perl-AppConfig--Sys"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
