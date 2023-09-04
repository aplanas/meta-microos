SUMMARY = "Comments that do more than just sit there"
DESCRIPTION = "Smart comments provide an easy way to insert debugging and tracking code \
into a program. They can report the value of a variable, track the progress \
of a loop, and verify that particular assertions are true. \
 \
Best of all, when you're finished debugging, you don't have to remove them. \
Simply commenting out the 'use Smart::Comments' line turns them back into \
regular comments. Leaving smart comments in your code is smart because if \
you needed them once, you'll almost certainly need them again later."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.06"

RPM_NAME = "perl-Smart-Comments-1.06-1.27.noarch.rpm"
RPM_HASH = "a7c07e918a4f36520cf5e00cd9be2361ebdd6e4d58a658653186534003cfa248e881af48512c5bd871f904ae793449b7e78b5e4af2ee2810897f109f9ab8b391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Smart--Comments \
perl-Smart-Comments"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
