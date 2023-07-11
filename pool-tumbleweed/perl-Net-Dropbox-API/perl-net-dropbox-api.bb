SUMMARY = "A dropbox API interface"
DESCRIPTION = "A dropbox API interface"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.9"

RPM_NAME = "perl-Net-Dropbox-API-1.9-2.19.noarch.rpm"
RPM_HASH = "c6afaf5ecc4d4b044d308b3cd7ddc20b2bdd597d0af1fbe8087bd5809b8816e369ff1faaabba51b7f24781ac4aa5ccbc0923550e841f40322fed522a4b2942bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Dropbox--API \
perl-Net-Dropbox-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Random \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Mouse \
perl-Net--OAuth \
perl-URI \
perl-common--sense"

inherit rpm
