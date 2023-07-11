SUMMARY = "Generate Kwalitee ratings for a distribution"
DESCRIPTION = "Generate Kwalitee ratings for a distribution"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Module-CPANTS-Analyse-1.01-1.10.noarch.rpm"
RPM_HASH = "ea0e6b7c4ae2ec4e6c43a1c6c8a40cdd4425bde7e412f4cc2af912c833bfc5ee6e19547a75a1ab1438d6a993178f64a311284a6e29050389aaa2c96dfe3befb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--CPANTS--Analyse \
perl-Module--CPANTS--Kwalitee \
perl-Module--CPANTS--Kwalitee--BrokenInstaller \
perl-Module--CPANTS--Kwalitee--CpantsErrors \
perl-Module--CPANTS--Kwalitee--Distname \
perl-Module--CPANTS--Kwalitee--Distros \
perl-Module--CPANTS--Kwalitee--Files \
perl-Module--CPANTS--Kwalitee--FindModules \
perl-Module--CPANTS--Kwalitee--License \
perl-Module--CPANTS--Kwalitee--Manifest \
perl-Module--CPANTS--Kwalitee--MetaYML \
perl-Module--CPANTS--Kwalitee--NeedsCompiler \
perl-Module--CPANTS--Kwalitee--Pod \
perl-Module--CPANTS--Kwalitee--Prereq \
perl-Module--CPANTS--Kwalitee--Repackageable \
perl-Module--CPANTS--Kwalitee--Signature \
perl-Module--CPANTS--Kwalitee--Uses \
perl-Module--CPANTS--Kwalitee--Version \
perl-Module-CPANTS-Analyse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Any--Lite \
perl-Archive--Tar \
perl-Array--Diff \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta--Validator \
perl-CPAN--Meta--YAML \
perl-Class--Accessor \
perl-Data--Binary \
perl-File--Find--Object \
perl-JSON--PP \
perl-List--Util \
perl-Module--Find \
perl-Perl--PrereqScanner--NotQuiteLite \
perl-Software--License \
perl-version"

inherit rpm
