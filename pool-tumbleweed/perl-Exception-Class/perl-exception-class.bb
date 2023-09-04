SUMMARY = "Module that allows you to declare real exception classes in Perl"
DESCRIPTION = "*RECOMMENDATION 1*: If you are writing modern Perl code with Moose or Moo I \
highly recommend using Throwable instead of this module. \
 \
*RECOMMENDATION 2*: Whether or not you use Throwable, you should use \
Try::Tiny. \
 \
Exception::Class allows you to declare exception hierarchies in your \
modules in a 'Java-esque' manner. \
 \
It features a simple interface allowing programmers to 'declare' exception \
classes at compile time. It also has a base exception class, \
Exception::Class::Base, that can be easily extended. \
 \
It is designed to make structured exception handling simpler and better by \
encouraging people to use hierarchies of exceptions in their applications, \
as opposed to a single catch-all exception class. \
 \
This module does not implement any try/catch syntax. Please see the 'OTHER \
EXCEPTION MODULES (try/catch syntax)' section for more information on how \
to get this syntax. \
 \
You will also want to look at the documentation for Exception::Class::Base, \
which is the default base class for all exception objects created by this \
module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.45"

RPM_NAME = "perl-Exception-Class-1.45-1.11.noarch.rpm"
RPM_HASH = "17f0e7b2db7cb59213d31580d077091a4cf916b98fdbf7ce47761f7696a4fce3d495c7225705c36b443d84e9e987ed0f38dd2da7cba14b3172a9948cf6237052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Class \
perl-Exception--Class--Base \
perl-Exception-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Data--Inheritable \
perl-Devel--StackTrace"

inherit rpm
