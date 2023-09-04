SUMMARY = "Generate Kwalitee ratings for a distribution"
DESCRIPTION = "Generate Kwalitee ratings for a distribution"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Module-CPANTS-Analyse-1.01-1.11.noarch.rpm"
RPM_HASH = "c5205d2acbbbbea3fb398acca01d182c5126a1a12358d9681cf4bf0433f5d8193f3faacbae97e4012056727405fe00274b236d4a145daf8db46463b0055606cb"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
