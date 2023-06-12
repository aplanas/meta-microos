SUMMARY = "A simple object base class."
DESCRIPTION = "the Rose::Object manpage is a generic object base class. It provides very \
little functionality, but a healthy dose of convention."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.860"

RPM_NAME = "perl-Rose-Object-0.860-1.26.noarch.rpm"
RPM_HASH = "33e6d424817801bec9372f883acb530e9af3a2c414b0fb1836c0eed99b99a12155f0363b9a541e5a2e4c64e85212b310963a4882f567146ee113dd53b9ad87fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Rose::Class) \
perl(Rose::Class::MakeMethods::Generic) \
perl(Rose::Class::MakeMethods::Set) \
perl(Rose::Object) \
perl(Rose::Object::MakeMethods) \
perl(Rose::Object::MakeMethods::DateTime) \
perl(Rose::Object::MakeMethods::Generic) \
perl(Rose::Object::MixIn) \
perl-Rose-Object"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
