SUMMARY = "Working (Require 'Class::Name') and More"
DESCRIPTION = "'require EXPR' only accepts 'Class/Name.pm' style module names, not \
'Class::Name'. How frustrating! For that, we provide 'load_class \
'Class::Name''. \
 \
It's often useful to test whether a module can be loaded, instead of \
throwing an error when it's not available. For that, we provide \
'try_load_class 'Class::Name''. \
 \
Finally, sometimes we need to know whether a particular class has been \
loaded. Asking '%INC' is an option, but that will miss inner packages and \
any class for which the filename does not correspond to the package name. \
For that, we provide 'is_class_loaded 'Class::Name''."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-Class-Load-0.25-1.16.noarch.rpm"
RPM_HASH = "8e7216c636c358b07a67a29efa339fcb649191b74f0809a0fce7f39ff45c49c9882b840edab556f0b73c42e4f44337c63b940ee15a524a1b220bf27ff0511dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Load) \
perl(Class::Load::PP) \
perl-Class-Load"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::OptList) \
perl(Module::Implementation) \
perl(Module::Runtime) \
perl(Package::Stash) \
perl(Try::Tiny)"

inherit rpm
