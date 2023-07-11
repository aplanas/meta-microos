SUMMARY = "Manage perl installations in your $HOME"
DESCRIPTION = "perlbrew is a program to automate the building and installation of perl in \
an easy way. It provides multiple isolated perl environments, and a \
mechanism for you to switch between them. \
 \
Everything are installed unter '~/perl5/perlbrew'. You then need to include \
a bashrc/cshrc provided by perlbrew to tweak the PATH for you. You then can \
benefit from not having to run 'sudo' commands to install cpan modules \
because those are installed inside your 'HOME' too. \
 \
For the documentation of perlbrew usage see perlbrew command on at \
https://metacpan.org/, or by running 'perlbrew help', or by visiting at \
https://perlbrew.pl/. The following documentation features the API of \
'App::perlbrew' module, and may not be remotely close to what your want to \
read."
LICENSE = "MIT"

PV = "0.97"

RPM_NAME = "perl-App-perlbrew-0.97-1.2.noarch.rpm"
RPM_HASH = "9c8a996f33e8b4ce81ed1b7d67ba52920d345ea2d2920288ed7982230b81cdb0d49cf6df58c93ba7eff1f0a7d65f3a83e19e75f9bce3bbe1729307b7b77e67d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Perlbrew--HTTP \
perl-App--Perlbrew--Path \
perl-App--Perlbrew--Path--Installation \
perl-App--Perlbrew--Path--Installations \
perl-App--Perlbrew--Path--Root \
perl-App--Perlbrew--Util \
perl-App--perlbrew \
perl-App-perlbrew"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Perl--Releases \
perl-Capture--Tiny \
perl-Devel--PatchPerl \
perl-ExtUtils--MakeMaker \
perl-File--Temp \
perl-JSON--PP \
perl-Pod--Usage \
perl-local--lib"

inherit rpm
