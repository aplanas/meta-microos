SUMMARY = "Tie to an existing object."
DESCRIPTION = "While the perldoc/tie manpage allows tying to an arbitrary object, the \
class in question must support this in it's implementation of 'TIEHASH', \
'TIEARRAY' or whatever. \
 \
This class provides a very tie constructor that simply returns the object \
it was given as it's first argument. \
 \
This way side effects of calling '$object->TIEHASH' are avoided. \
 \
This is used in the Data::Visitor manpage in order to tie a variable to an \
already existing object. This is also useful for cloning, when you want to \
clone the internal state object instead of going through the tie interface \
for that variable."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Tie-ToObject-0.03-13.28.noarch.rpm"
RPM_HASH = "7aa0c78d91d60523a63a636fb82521d81ca91b4ac51755ef642c2dd78c901243f0acdcfabd6c908edb995cca2d2f41ffbf25864cdbaee3918f344d5f527ca36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--ToObject \
perl-Tie-ToObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--use--ok"

inherit rpm
