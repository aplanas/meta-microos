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

RPM_NAME = "perl-App-perlbrew-0.97-1.3.noarch.rpm"
RPM_HASH = "a6dc0041b06d8e21d0c9a44068bfcd554f21a5d8dccdb30ea0025fd294958149040682568097566cb193979e325493a87477696b25b0d5897bcdf8d8a256f7fb"
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
perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Perl--Releases \
perl-Capture--Tiny \
perl-Devel--PatchPerl \
perl-ExtUtils--MakeMaker \
perl-File--Temp \
perl-JSON--PP \
perl-Pod--Usage \
perl-local--lib"

inherit rpm
