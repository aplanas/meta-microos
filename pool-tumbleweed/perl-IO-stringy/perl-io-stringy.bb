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

RPM_NAME = "perl-IO-stringy-2.113-1.14.noarch.rpm"
RPM_HASH = "7b0e0beaec29ecfed84ac979574c5c9e04be0a8e85aa58fc6a7140296e18df431a4cc9f69919667f061328c3c2ba55ff10d914be4f3e850a277f0235c19381ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--AtomicFile \
perl-IO--InnerFile \
perl-IO--Lines \
perl-IO--Scalar \
perl-IO--ScalarArray \
perl-IO--Stringy \
perl-IO--Wrap \
perl-IO--WrapTie \
perl-IO-stringy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
