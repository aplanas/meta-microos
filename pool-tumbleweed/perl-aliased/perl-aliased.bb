SUMMARY = "Use shorter versions of class names"
DESCRIPTION = "'aliased' is simple in concept but is a rather handy module. It loads the \
class you specify and exports into your namespace a subroutine that returns \
the class name. You can explicitly alias the class to another name or, if \
you prefer, you can do so implicitly. In the latter case, the name of the \
subroutine is the last part of the class name. Thus, it does something \
similar to the following: \
 \
   \
 \
  use Some::Annoyingly::Long::Module::Name::Customer; \
  sub Customer { \
    return 'Some::Annoyingly::Long::Module::Name::Customer'; \
  } \
  my $cust = Customer->new; \
 \
This module is useful if you prefer a shorter name for a class. It's also \
handy if a class has been renamed. \
 \
(Some may object to the term 'aliasing' because we're not aliasing one \
namespace to another, but it's a handy term. Just keep in mind that this is \
done with a subroutine and not with typeglobs and weird namespace munging.) \
 \
Note that this is *only* for 'use'ing OO modules. You cannot use this to \
load procedural modules. See the the Why OO Only? manpage section. Also, \
don't let the version number fool you. This code is ridiculously simple and \
is just fine for most use."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.34"

RPM_NAME = "perl-aliased-0.34-1.26.noarch.rpm"
RPM_HASH = "277fb632c0e343b972cc80115dc9939c002c5de1c7917042872fcbe14689558249965d92531a8ab3fc7463ac2506c164304ba9b9e2626c76b2799fb5a6db97da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-aliased"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
