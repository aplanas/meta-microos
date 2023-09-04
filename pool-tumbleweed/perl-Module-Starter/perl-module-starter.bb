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

RPM_NAME = "perl-Module-Starter-1.77-1.14.noarch.rpm"
RPM_HASH = "32acd4ac5a3482813112e93fa20dd25d111af359ab083f623e96fcd2dc77f5ff1a27691c4802d5c5ad3da5a1b90983506db402083f2670f8dad40e40b538bfbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Starter \
perl-Module--Starter--App \
perl-Module--Starter--BuilderSet \
perl-Module--Starter--Plugin--Template \
perl-Module--Starter--Simple \
perl-Module-Starter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime \
perl-Software--License \
perl-Test--More \
perl-parent \
perl-version"

inherit rpm
