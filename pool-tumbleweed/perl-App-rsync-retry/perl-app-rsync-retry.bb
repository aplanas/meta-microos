SUMMARY = "Rsync wrapper to retry on transfer errrors"
DESCRIPTION = "Rsync wrapper to retry on transfer errrors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-App-rsync-retry-0.007-1.9.noarch.rpm"
RPM_HASH = "213c63c5c0a29118a2a672b8174e7cc382bf6cabe57daea0cfd4b2562350cec8df8f82f6939bb63b1382ae1029d3830e598bb7273031e4f37cc5eda790837745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--rsync--retry \
perl-App-rsync-retry"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-File--Which \
perl-Getopt--Long"

inherit rpm
