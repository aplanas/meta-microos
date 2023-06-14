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

RPM_NAME = "perl-Tie-ToObject-0.03-13.26.noarch.rpm"
RPM_HASH = "ef54a37b5afff197a46942c3a7613b160c1b44fd950440543c89067a6f58f69bcb1d017ffbcc0b9a5abd564d75d82ea449f89f05693d3bd732acedced09b55f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--ToObject \
perl-Tie-ToObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Test--use--ok"

inherit rpm
