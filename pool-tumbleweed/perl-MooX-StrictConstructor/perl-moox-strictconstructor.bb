SUMMARY = "Make your Moo-based object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it dies. This is a great way to catch small typos. \
 \
Your application can use Carp::Always to generate stack traces on 'die'. \
Previously all exceptions contained traces, but this could potentially leak \
sensitive information, e.g. \
 \
    My::Sensitive::Class->new( password => $sensitive, extra_value => 'foo' );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.011"

RPM_NAME = "perl-MooX-StrictConstructor-0.011-1.10.noarch.rpm"
RPM_HASH = "5b1c5b6a2ab402a61670c6436dc14bd3f3d6e29ffab456b0870b453d9fe38c0c3e0a763f114fff3c0cd07c0cf45a97afc5a8fa3f4e057491da4ea33fb4690c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Method::Generate::Constructor::Role::StrictConstructor) \
perl(MooX::StrictConstructor) \
perl-MooX-StrictConstructor"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Method::Modifiers) \
perl(Moo) \
perl(Moo::Role) \
perl(strictures)"

inherit rpm
