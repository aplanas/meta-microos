SUMMARY = "Perl5 module for reading configuration files and parsing command line ar[cut]"
DESCRIPTION = "Perl5 module for reading configuration files and parsing command line arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.71"

RPM_NAME = "perl-AppConfig-1.71-1.29.noarch.rpm"
RPM_HASH = "44279429e136cfbeace1a0eedee1dac6ffaa1ea59d28dd67ed93d9fef180b0ad429e867cb7ba50ffb1e30e90c562b464f117b0618ccd86a03e17284ba6394145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AppConfig \
perl-AppConfig--Args \
perl-AppConfig--CGI \
perl-AppConfig--File \
perl-AppConfig--Getopt \
perl-AppConfig--State \
perl-AppConfig--Sys"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
