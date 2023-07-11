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

RPM_NAME = "perl-Tie-ToObject-0.03-13.27.noarch.rpm"
RPM_HASH = "a0ad18bf5776bd1da49f80adc2574a9662805690c4a6780359ffe3c0fb8116bb5985e550c887be2334114dbc4d92bc2ce8835d839a0d82dddfa86ed336c77d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--ToObject \
perl-Tie-ToObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--use--ok"

inherit rpm
