SUMMARY = "Provides Moose-like method modifiers"
DESCRIPTION = "Method modifiers are a convenient feature from the CLOS (Common Lisp Object \
System) world. \
 \
In its most basic form, a method modifier is just a method that calls \
'$self->SUPER::foo(@_)'. I for one have trouble remembering that exact \
invocation, so my classes seldom re-dispatch to their base classes. Very \
bad! \
 \
'Class::Method::Modifiers' provides three modifiers: 'before', 'around', \
and 'after'. 'before' and 'after' are run just before and after the method \
they modify, but can not really affect that original method. 'around' is \
run in place of the original method, with a hook to easily call that \
original method. See the MODIFIERS section for more details on how the \
particular modifiers work. \
 \
One clear benefit of using 'Class::Method::Modifiers' is that you can \
define multiple modifiers in a single namespace. These separate modifiers \
don't need to know about each other. This makes top-down design easy. Have \
a base class that provides the skeleton methods of each operation, and have \
plugins modify those methods to flesh out the specifics. \
 \
Parent classes need not know about 'Class::Method::Modifiers'. This means \
you should be able to modify methods in _any_ subclass. See \
Term::VT102::ZeroBased for an example of subclassing with \
'Class::Method::Modifiers'. \
 \
In short, 'Class::Method::Modifiers' solves the problem of making sure you \
call '$self->SUPER::foo(@_)', and provides a cleaner interface for it. \
 \
As of version 1.00, 'Class::Method::Modifiers' is faster in some cases than \
Moose. See _benchmark/method_modifiers.pl_ in the Moose distribution. \
 \
'Class::Method::Modifiers' also provides an additional 'modifier' type, \
'fresh'; see below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.15"

RPM_NAME = "perl-Class-Method-Modifiers-2.15-1.2.noarch.rpm"
RPM_HASH = "a504ab9b3e285d7d412648c7bcbdd6581ff1cd18261a7ea9d9c87676ddc597df50d88df1b837b205a9d88631b2a1c65d404b78bf35e797e6b93b8f2c9411b5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Method--Modifiers \
perl-Class-Method-Modifiers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
