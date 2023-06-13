SUMMARY = "A wrapper for C<new> that can accept a"
DESCRIPTION = "This role allows you to easily accept a 'traits' argument (or another name) \
into your constructor, which will easily mix roles into an anonymous class \
before construction, much like the Moose::Meta::Attribute manpage does."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-MooseX-Role-TraitConstructor-0.01-9.25.noarch.rpm"
RPM_HASH = "c83d69a09942921031e8f39a78820a7aba10010540e2a6880b17707ff31486e4aa5822be2c97c91d0214722bb3e70e07bbbdada5abd301bb92247700e24e6c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Role::TraitConstructor) \
perl-MooseX-Role-TraitConstructor"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Test::Exception) \
perl(Test::use::ok)"

inherit rpm
