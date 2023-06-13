SUMMARY = "I/O on in-core objects like strings and arrays"
DESCRIPTION = "This toolkit primarily provides modules for performing both traditional and \
object-oriented i/o) on things _other_ than normal filehandles; in \
particular, IO::Scalar, IO::ScalarArray, and IO::Lines. \
 \
In the more-traditional IO::Handle front, we have IO::AtomicFile which may \
be used to painlessly create files which are updated atomically. \
 \
And in the 'this-may-prove-useful' corner, we have IO::Wrap, whose exported \
wraphandle() function will clothe anything that's not a blessed object in \
an IO::Handle-like wrapper... so you can just use OO syntax and stop \
worrying about whether your function's caller handed you a string, a \
globref, or a FileHandle."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.113"

RPM_NAME = "perl-IO-stringy-2.113-1.13.noarch.rpm"
RPM_HASH = "edd3c4b31f293ee1f93e966a1d5e3135301a332ffdae4d2797ce5bb0d7cb637798fb0c5527188f5c60f578f146fca2928693bb29f03a1b41268c8405280a6e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::AtomicFile) \
perl(IO::InnerFile) \
perl(IO::Lines) \
perl(IO::Scalar) \
perl(IO::ScalarArray) \
perl(IO::Stringy) \
perl(IO::Wrap) \
perl(IO::WrapTie) \
perl-IO-stringy"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
