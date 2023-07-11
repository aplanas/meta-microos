SUMMARY = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
DESCRIPTION = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "perl-Alien-Tidyp-1.4.7-8.29.noarch.rpm"
RPM_HASH = "43b7b70027fcad880551868edacef6479eb54b9b173279cd4d8d0a42383151d16636da76de7dc295d6298c15f9d0445c2994c042d721d045dc0eca15b7d11b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Tidyp \
perl-Alien--Tidyp--ConfigData \
perl-Alien-Tidyp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir"

inherit rpm
