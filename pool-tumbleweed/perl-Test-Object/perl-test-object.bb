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

RPM_NAME = "perl-Test-Object-0.08-1.19.noarch.rpm"
RPM_HASH = "8a770fe641ac42f0011e4dc21dd7d7724a19db6868a8e399ae0d45195bcf6b6daa5c99a745e90936854e5f886ed377d6ae8041586e76bd66e07780227d0dcf77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Object) \
perl(Test::Object::Test) \
perl-Test-Object"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
