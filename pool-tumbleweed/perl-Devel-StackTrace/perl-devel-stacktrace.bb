SUMMARY = "An object representing a stack trace"
DESCRIPTION = "The 'Devel::StackTrace' module contains two classes, 'Devel::StackTrace' \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's 'caller' function, as well as providing a \
simple interface to this data. \
 \
The 'Devel::StackTrace' object contains a set of 'Devel::StackTrace::Frame' \
objects, one for each level of the stack. The frames contain all the data \
available from 'caller'. \
 \
This code was created to support my Exception::Class::Base class (part of \
Exception::Class) but may be useful in other contexts."
LICENSE = "Artistic-2.0"

PV = "2.04"

RPM_NAME = "perl-Devel-StackTrace-2.04-1.18.noarch.rpm"
RPM_HASH = "caccd68f3ef3d66e66e4fd98baff03085dcc706d006f65956a65e92b52bb9de15031069849590cf81710c6e4d1a88abd442243622de519d7666177e61a6fb4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace \
perl-Devel--StackTrace--Frame \
perl-Devel-StackTrace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
