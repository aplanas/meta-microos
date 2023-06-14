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

RPM_NAME = "perl-aliased-0.34-1.24.noarch.rpm"
RPM_HASH = "ab425e9fbc3088f83062c87bcaf7dfa7fe0f78e5bf56932233239018aef82274e85f64654331125133e06326a0eed2623d559486c29c0e9f42cbbd038ddd1322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-aliased"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
