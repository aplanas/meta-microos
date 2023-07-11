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

RPM_NAME = "perl-Devel-StackTrace-2.04-1.17.noarch.rpm"
RPM_HASH = "8e173dee7cb7012b31f0c64bb53d3bfb231874f47fbe37cce668fa5460778537c2251aeb861bdf5cfb0f1c98cc9efce7e2487e4f11ef864aa8bf40d9b0a96ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace \
perl-Devel--StackTrace--Frame \
perl-Devel-StackTrace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
