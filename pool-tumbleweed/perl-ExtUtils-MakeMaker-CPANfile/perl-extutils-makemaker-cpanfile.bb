SUMMARY = "Cpanfile Support for Eumm"
DESCRIPTION = "ExtUtils::MakeMaker::CPANfile loads 'cpanfile' in your distribution and \
modifies parameters for 'WriteMakefile' in your Makefile.PL. Just use it \
instead of ExtUtils::MakeMaker (which should be loaded internally), and \
prepare 'cpanfile'. \
 \
As of version 0.03, ExtUtils::MakeMaker::CPANfile also removes \
WriteMakefile parameters that the installed version of ExtUtils::MakeMaker \
doesn't know, to avoid warnings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-ExtUtils-MakeMaker-CPANfile-0.09-1.17.noarch.rpm"
RPM_HASH = "15a0d250601d7eec4ac059a8cb2ddf921a598216f4235bb085039c3c083459c899dd3e1b64bb20c5523d8b5a6031b74b86b7a72749faa183c89d6042eb7042a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--MakeMaker--CPANfile \
perl-ExtUtils-MakeMaker-CPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta--Converter \
perl-Module--CPANfile \
perl-Test--More \
perl-version"

inherit rpm
