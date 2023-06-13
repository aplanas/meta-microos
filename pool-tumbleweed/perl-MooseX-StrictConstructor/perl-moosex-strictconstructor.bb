SUMMARY = "Make your object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it calls 'Moose->throw_error()'. This is a great way to \
catch small typos."
LICENSE = "Artistic-2.0"

PV = "0.21"

RPM_NAME = "perl-MooseX-StrictConstructor-0.21-1.22.noarch.rpm"
RPM_HASH = "a2cef0777ea0d0112167a23a8b6233d5f085fc15b3dd4d9bbb68429a11f7811b9f35885d487d69639ebdfece15b8f0a46f856f7feab88128e21bfa806a14e3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::StrictConstructor) \
perl(MooseX::StrictConstructor::Trait::Class) \
perl(MooseX::StrictConstructor::Trait::Method::Constructor) \
perl-MooseX-StrictConstructor"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Moose::Exporter) \
perl(Moose::Role) \
perl(Moose::Util::MetaRole) \
perl(namespace::autoclean)"

inherit rpm
