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

RPM_NAME = "perl-ExtUtils-MakeMaker-CPANfile-0.09-1.16.noarch.rpm"
RPM_HASH = "e792834fcae1f7d2ad37b3bc514d1e966aaf94de2ac581279c751a9bcc7ff5ff126bccd24d62323848d5211e34d7b15cfe201e9d843f1b9550adab9667022b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--MakeMaker--CPANfile \
perl-ExtUtils-MakeMaker-CPANfile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-CPAN--Meta--Converter \
perl-Module--CPANfile \
perl-Test--More \
perl-version"

inherit rpm
