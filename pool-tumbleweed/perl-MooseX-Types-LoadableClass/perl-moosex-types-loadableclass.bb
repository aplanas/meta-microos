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

RPM_NAME = "perl-MooseX-Types-LoadableClass-0.015-1.22.noarch.rpm"
RPM_HASH = "b2761d7415cd5bcc9f8193903da896e18e24a6d72312a2b03a01b5fabda6e53a12694e3383944e241517ee89059fe9ab99dfff42d1927c18deb743c4e2620676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--LoadableClass \
perl-MooseX-Types-LoadableClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--autoclean"

inherit rpm
