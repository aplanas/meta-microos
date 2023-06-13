SUMMARY = "Automatically Give Your Module the Ability to Have Plugins"
DESCRIPTION = "Provides a simple but, hopefully, extensible way of having 'plugins' for \
your module. Obviously this isn't going to be the be all and end all of \
solutions but it works for me. \
 \
Essentially all it does is export a method into your namespace that looks \
through a search path for .pm files and turn those into class names. \
 \
Optionally it instantiates those classes for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "5.2"

RPM_NAME = "perl-Module-Pluggable-5.2-1.26.noarch.rpm"
RPM_HASH = "4f98cdebadb5925365237505031500a0a516cd3e8d0fe91c3073d90b7835b83b1b206198e28a731b5ec6b525747b9db73d895e18171ff8d826bfcfe408d47dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::InnerPackage) \
perl(Module::Pluggable) \
perl(Module::Pluggable::Object) \
perl-Module-Pluggable"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
