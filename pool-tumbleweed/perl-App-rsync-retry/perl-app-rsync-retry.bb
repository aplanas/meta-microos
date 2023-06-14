SUMMARY = "Rsync wrapper to retry on transfer errrors"
DESCRIPTION = "Rsync wrapper to retry on transfer errrors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-App-rsync-retry-0.007-1.7.noarch.rpm"
RPM_HASH = "c6b0be2240983adc706933e5124f803c6294ec4ccc08732fe75ad756c61d6e8eaf31727ed78b6a8e8c2a883b1b125c1dca12878ca22bf1fa44dff455c32fd1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--rsync--retry \
perl-App-rsync-retry"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-File--Which \
perl-Getopt--Long"

inherit rpm
