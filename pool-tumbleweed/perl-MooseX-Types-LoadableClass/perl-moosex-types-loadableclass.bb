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

RPM_NAME = "perl-MooseX-Types-LoadableClass-0.015-1.21.noarch.rpm"
RPM_HASH = "9da02ca24716038dae867768005a0a943c6e456233969387250d099c0d8f74b59e861f1ec69fafd9b8a64cdfe8c8c6098801ca9dce5e26471451d2f8bbb68dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--LoadableClass \
perl-MooseX-Types-LoadableClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--autoclean"

inherit rpm
