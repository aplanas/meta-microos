SUMMARY = "Rsync wrapper to retry on transfer errrors"
DESCRIPTION = "Rsync wrapper to retry on transfer errrors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-App-rsync-retry-0.007-1.8.noarch.rpm"
RPM_HASH = "11f3e90637d4d1b6d1031d7f38ced9305d7695c69102303e14906deee4dbdcfac3949a4bdf8eaefb5f44bd4db67759402aa8490840c632ae456f5eece6c4c13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--rsync--retry \
perl-App-rsync-retry"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-File--Which \
perl-Getopt--Long"

inherit rpm
