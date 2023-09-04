SUMMARY = "URLs that refer to things on the CPAN"
DESCRIPTION = "URLs that refer to things on the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-URI-cpan-1.008-1.9.noarch.rpm"
RPM_HASH = "5deb14cd0c1ad44f1e12b05355166fbd4fc19983bf95855c32073673bec709f5212cda3e650575f3a3c6d7ba14c9a663a37279a732b4c0e4c191b21acf34619b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--cpan \
perl-URI--cpan--author \
perl-URI--cpan--dist \
perl-URI--cpan--distfile \
perl-URI--cpan--module \
perl-URI--cpan--package \
perl-URI-cpan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--DistnameInfo \
perl-URI \
perl-parent"

inherit rpm
