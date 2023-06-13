SUMMARY = "ClassName type constraint with coercion to load the class"
DESCRIPTION = "    use Moose::Util::TypeConstraints; \
 \
    my $tc = subtype as ClassName; \
    coerce $tc, from Str, via { Class::Load::load_class($_); $_ }; \
 \
I've written those three lines of code quite a lot of times, in quite a lot \
of places. \
 \
Now I don't have to."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.015"

RPM_NAME = "perl-MooseX-Types-LoadableClass-0.015-1.20.noarch.rpm"
RPM_HASH = "038d34fc27e469b80b2959283a625176f3069dea46aa7c0e33666fe4dab56add16c8fdf47e126586b5b1819ebe3b427dbd1c9e0657802e670d23962ddf93ab81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::LoadableClass) \
perl-MooseX-Types-LoadableClass"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Runtime) \
perl(MooseX::Types) \
perl(MooseX::Types::Moose) \
perl(namespace::autoclean)"

inherit rpm
