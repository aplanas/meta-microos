SUMMARY = "Common rules for searching for Perl things"
DESCRIPTION = "I write a lot of things that muck with Perl files. And it always annoyed me \
that finding 'perl files' requires a moderately complex File::Find::Rule \
pattern. \
 \
*File::Find::Rule::Perl* provides methods for finding various types \
Perl-related files, or replicating search queries run on a distribution in \
various parts of the CPAN ecosystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-File-Find-Rule-Perl-1.16-1.8.noarch.rpm"
RPM_HASH = "efebed330420224fbb65f02beee8f53039cd253dd17ff165f96e30cc1a7bbbb5f990e1cc2cc3a970d3cd78c338231715be10a4259ff419ccdada3fdd8eba417a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule--Perl \
perl-File-Find-Rule-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Find--Rule \
perl-Params--Util \
perl-Parse--CPAN--Meta"

inherit rpm
