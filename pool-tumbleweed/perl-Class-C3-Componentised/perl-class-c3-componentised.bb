SUMMARY = "Load mix-ins or components to your C3-based class"
DESCRIPTION = "This will inject base classes to your module using the Class::C3 method \
resolution order. \
 \
Please note: these are not plugins that can take precedence over methods \
declared in MyModule. If you want something like that, consider \
MooseX::Object::Pluggable."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001002"

RPM_NAME = "perl-Class-C3-Componentised-1.001002-1.17.noarch.rpm"
RPM_HASH = "a142bb12055287d64f4ceb5a69d1b8bd77f2987a73abb0a4b5983cbefe9b1dcf71107e4b3f423d1a1e19caa5a69231c4728f9698b7a4572bae9959191af5fa46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::C3::Componentised) \
perl(Class::C3::Componentised::ApplyHooks) \
perl-Class-C3-Componentised"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::C3) \
perl(Class::Inspector) \
perl(MRO::Compat)"

inherit rpm
