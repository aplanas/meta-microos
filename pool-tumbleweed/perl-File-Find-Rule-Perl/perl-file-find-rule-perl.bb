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

RPM_NAME = "perl-File-Find-Rule-Perl-1.16-1.7.noarch.rpm"
RPM_HASH = "f703bdd8674c98a3fc35d1a22f01158e76f3513fa6dd591ef57c0d657f9ae413995a1376f1d0db682c895c39b02856099560a8017825d2d09b93e47c58e46d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule--Perl \
perl-File-Find-Rule-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Find--Rule \
perl-Params--Util \
perl-Parse--CPAN--Meta"

inherit rpm
