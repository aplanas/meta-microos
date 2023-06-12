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

RPM_NAME = "perl-Module-Starter-1.77-1.12.noarch.rpm"
RPM_HASH = "70a2750064f7dccc43ffccb1aee15236865f231739572a4d592a5eca2d4d83975165fcf2aa411f3e6d66492a9d33180177cd96de6280890581814517e0f3cf95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Starter) \
perl(Module::Starter::App) \
perl(Module::Starter::BuilderSet) \
perl(Module::Starter::Plugin::Template) \
perl(Module::Starter::Simple) \
perl-Module-Starter"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Runtime) \
perl(Software::License) \
perl(Test::More) \
perl(parent) \
perl(version)"

inherit rpm
