SUMMARY = "Path::Class type library for Moose"
DESCRIPTION = "MooseX::Types::Path::Class creates common Moose types, coercions and option \
specifications useful for dealing with Path::Class objects as Moose \
attributes. \
 \
Coercions (see Moose::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MooseX::Getopt installed, the 'Getopt' option type ('=s') will be \
added for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-MooseX-Types-Path-Class-0.09-1.21.noarch.rpm"
RPM_HASH = "4a9f7c14559f4f02aa9afe8af6f8cd4cd1594075af65321bfbd041f168749d2ca3573cca248a4ca694cadeca398b94cead902b4ac482fb4d9318fc92afeddd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::Path::Class) \
perl-MooseX-Types-Path-Class"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MooseX::Types) \
perl(MooseX::Types::Moose) \
perl(Path::Class)"

inherit rpm
