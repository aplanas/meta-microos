SUMMARY = "NativeTrait-like behavior for Moo"
DESCRIPTION = "MooX::HandlesVia is an extension of Moo's 'handles' attribute \
functionality. It provides a means of proxying functionality from an \
external class to the given atttribute. This is most commonly used as a way \
to emulate 'Native Trait' behavior that has become commonplace in Moose \
code, for which there was no Moo alternative."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001009"

RPM_NAME = "perl-MooX-HandlesVia-0.001009-1.12.noarch.rpm"
RPM_HASH = "eada43e4bb7ac7aa210bf558635e29d03386770d2afeca17791617fe1f7d6cd499630b7d3362ec0025eb9cbc53b57f37cb52a020e875ecb709cf81bf3937d0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Perl::Bool::MooseLike) \
perl(Data::Perl::Collection::Array::MooseLike) \
perl(Data::Perl::Collection::Hash::MooseLike) \
perl(Data::Perl::Number::MooseLike) \
perl(Data::Perl::String::MooseLike) \
perl(MooX::HandlesVia) \
perl-MooX-HandlesVia"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Method::Modifiers) \
perl(Data::Perl) \
perl(Module::Runtime) \
perl(Moo) \
perl(Role::Tiny)"

inherit rpm
