SUMMARY = "Information about Perl modules"
DESCRIPTION = "Module::Info gives you information about Perl modules *without actually \
loading the module*. It actually isn't specific to modules and should work \
on any perl code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.37"

RPM_NAME = "perl-Module-Info-0.37-1.25.noarch.rpm"
RPM_HASH = "90cd0b4bbb84ca5c2efc71f4c5c60b24cc6d349c46a3f13297c2c8a09cfc60b07579b784077e996360536b707e27a900b62b4b68c52f5ebcae8552b1346e653c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(B::Module::Info) \
perl(Module::Info) \
perl(Module::Info::Safe) \
perl(Module::Info::Unsafe) \
perl(Module::Info::_version) \
perl-Module-Info"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(B::Utils)"

inherit rpm
