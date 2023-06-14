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

RPM_NAME = "perl-Class-Method-Modifiers-2.15-1.1.noarch.rpm"
RPM_HASH = "fe8287e6db9eb3d279a2299c61457be7b01bb11c39646f0c1247a8e8c252c88944b4650f378987be20f23d879acd7ced695781a912c36d2e6ed265d269472f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Method--Modifiers \
perl-Class-Method-Modifiers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
