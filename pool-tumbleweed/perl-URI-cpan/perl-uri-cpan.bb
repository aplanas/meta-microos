SUMMARY = "URLs that refer to things on the CPAN"
DESCRIPTION = "URLs that refer to things on the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-URI-cpan-1.008-1.8.noarch.rpm"
RPM_HASH = "5758105f5a79cc98b3f2b31926e0ed5f12f3816023c219872c3804f26f8660ecd6506dce87beea93b6756bb2df8f7a76b2a295b4f95db134475ab042df3baae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--cpan \
perl-URI--cpan--author \
perl-URI--cpan--dist \
perl-URI--cpan--distfile \
perl-URI--cpan--module \
perl-URI--cpan--package \
perl-URI-cpan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--DistnameInfo \
perl-URI \
perl-parent"

inherit rpm
