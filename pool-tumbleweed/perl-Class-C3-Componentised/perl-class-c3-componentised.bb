SUMMARY = "Load mix-ins or components to your C3-based class"
DESCRIPTION = "This will inject base classes to your module using the Class::C3 method \
resolution order. \
 \
Please note: these are not plugins that can take precedence over methods \
declared in MyModule. If you want something like that, consider \
MooseX::Object::Pluggable."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001002"

RPM_NAME = "perl-Class-C3-Componentised-1.001002-1.19.noarch.rpm"
RPM_HASH = "cc42cfb111369355bf43f47dbcb6de6e486e64735ac8a2622b3f2ba0f6d107fb9d81993ac6db2d09a33f02cb2afe19e64bb74c01bd5fb8b5b49fab66cecb6677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Componentised \
perl-Class--C3--Componentised--ApplyHooks \
perl-Class-C3-Componentised"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--C3 \
perl-Class--Inspector \
perl-MRO--Compat"

inherit rpm
