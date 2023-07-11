SUMMARY = "Simple starter kit for any module"
DESCRIPTION = "This is the core module for Module::Starter. If you're not looking to \
extend or alter the behavior of this module, you probably want to look at \
module-starter instead. \
 \
Module::Starter is used to create a skeletal CPAN distribution, including \
basic builder scripts, tests, documentation, and module code. This is done \
through just one method, 'create_distro'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.77"

RPM_NAME = "perl-Module-Starter-1.77-1.13.noarch.rpm"
RPM_HASH = "e610b998f436d1a56da7c6373e5b27f85b954b87f6566729f3e58c7802c916e55762413fb3df30b596b1050ddb32932ac1194b8be5067fdd7bdd4095434874ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Starter \
perl-Module--Starter--App \
perl-Module--Starter--BuilderSet \
perl-Module--Starter--Plugin--Template \
perl-Module--Starter--Simple \
perl-Module-Starter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime \
perl-Software--License \
perl-Test--More \
perl-parent \
perl-version"

inherit rpm
