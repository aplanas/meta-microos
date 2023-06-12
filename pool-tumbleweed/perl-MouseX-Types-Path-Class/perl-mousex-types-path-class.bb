SUMMARY = "Path::Class type library for Mouse"
DESCRIPTION = "MouseX::Types::Path::Class creates common Mouse types, coercions and option \
specifications useful for dealing with Path::Class objects as Mouse \
attributes. \
 \
Coercions (see Mouse::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MouseX::Getopt installed, the Getopt option type ('=s') will be added \
for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-MouseX-Types-Path-Class-0.07-4.19.noarch.rpm"
RPM_HASH = "b3c9f2bc91f980225b4c26f2a1ea7d41283ce08d723218c6209f812c70c0766d58bab4c7b437686549b711e592171bdb90127f7ebf92a4c8debf05fcff5ab59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MouseX::Types::Path::Class) \
perl-MouseX-Types-Path-Class"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mouse) \
perl(MouseX::Types) \
perl(Path::Class)"

inherit rpm
