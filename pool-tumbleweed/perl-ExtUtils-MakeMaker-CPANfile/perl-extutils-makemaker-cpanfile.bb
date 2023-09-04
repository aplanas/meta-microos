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

RPM_NAME = "perl-ExtUtils-MakeMaker-CPANfile-0.09-1.18.noarch.rpm"
RPM_HASH = "a2568c1953dd430f0a6a7360905ccd9c1d29556375d42c45367965cd1d81b8ced8a8d93bb91e83dc218dc54d13be02f32889ccfceb825bdcf86ccc8fada4b4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--MakeMaker--CPANfile \
perl-ExtUtils-MakeMaker-CPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta--Converter \
perl-Module--CPANfile \
perl-Test--More \
perl-version"

inherit rpm
