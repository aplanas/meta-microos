SUMMARY = "Thoroughly testing objects via registered handlers"
DESCRIPTION = "In situations where you have deep trees of classes, there is a common \
situation in which you test a module 4 or 5 subclasses down, which should \
follow the correct behaviour of not just the subclass, but of all the \
parent classes. \
 \
This should be done to ensure that the implementation of a subclass has not \
somehow 'broken' the object's behaviour in a more general sense. \
 \
'Test::Object' is a testing package designed to allow you to easily test \
what you believe is a valid object against the expected behaviour of *all* \
of the classes in its inheritance tree in one single call. \
 \
To do this, you 'register' tests (in the form of CODE or function \
references) with 'Test::Object', with each test associated with a \
particular class. \
 \
When you call 'object_ok' in your test script, 'Test::Object' will check \
the object against all registered tests. For each class that your object \
responds to '$object->isa($class)' for, the appropriate testing function \
will be called. \
 \
Doing it this way allows adapter objects and other things that respond to \
'isa' differently that the default to still be tested against the classes \
that it is advertising itself as correctly. \
 \
This also means that more than one test might be 'counted' for each call to \
'object_ok'. You should account for this correctly in your expected test \
count."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Test-Object-0.08-1.21.noarch.rpm"
RPM_HASH = "e3423a10b843ebb3a13376561f274c4328d9c16adece6623616f8886e6393784f07fc3abe4fda369f2d313b1eadd7728c544412789d33ddedc8ba46d69476fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Object \
perl-Test--Object--Test \
perl-Test-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
