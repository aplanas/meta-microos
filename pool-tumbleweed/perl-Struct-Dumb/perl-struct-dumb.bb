SUMMARY = "Make simple lightweight record-like structures"
DESCRIPTION = "'Struct::Dumb' creates record-like structure types, similar to the 'struct' \
keyword in C, C++ or C#, or 'Record' in Pascal. An invocation of this \
module will create a construction function which returns new object \
references with the given field values. These references all respond to \
lvalue methods that access or modify the values stored. \
 \
It's specifically and intentionally not meant to be an object class. You \
cannot subclass it. You cannot provide additional methods. You cannot apply \
roles or mixins or metaclasses or traits or antlers or whatever else is in \
fashion this week. \
 \
On the other hand, it is tiny, creates cheap lightweight array-backed \
structures, uses nothing outside of core. It's intended simply to be a \
slightly nicer way to store data structures, where otherwise you might be \
tempted to abuse a hash, complete with the risk of typoing key names. The \
constructor will 'croak' if passed the wrong number of arguments, as will \
attempts to refer to fields that don't exist. Accessor-mutators will \
'croak' if invoked with arguments. (This helps detect likely bugs such as \
accidentally passing in the new value as an argument, or attempting to \
invoke a stored 'CODE' reference by passing argument values directly to the \
accessor.) \
 \
   $ perl -E 'use Struct::Dumb; struct Point => [qw( x y )]; Point(30)' \
   usage: main::Point($x, $y) at -e line 1 \
 \
   $ perl -E 'use Struct::Dumb; struct Point => [qw( x y )]; Point(10,20)->z' \
   main::Point does not have a 'z' field at -e line 1 \
 \
   $ perl -E 'use Struct::Dumb; struct Point => [qw( x y )]; Point(1,2)->x(3)' \
   main::Point->x invoked with arguments at -e line 1. \
 \
Objects in this class are (currently) backed by an ARRAY reference store, \
though this is an internal implementation detail and should not be relied \
on by using code. Attempting to dereference the object as an ARRAY will \
throw an exception. \
 \
_Note_: That on development perls that support 'use feature 'class'', this \
is used instead of a blessed ARRAY reference. This implementation choice \
should be transparent to the end-user, as all the same features are \
supported."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Struct-Dumb-0.14-1.1.noarch.rpm"
RPM_HASH = "8a4c66693206fa0a61d18591f40a6ec012f3b8e7dd65080eb679807ce7ab1823ff79c720ae4147986f08fd23015866a09f03af4467db6fd712b15a4c92fbc84a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Struct--Dumb \
perl-Struct--Dumb---DestroyWatch \
perl-Struct-Dumb"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
