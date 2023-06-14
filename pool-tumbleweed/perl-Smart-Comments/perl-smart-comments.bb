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

RPM_NAME = "perl-Smart-Comments-1.06-1.25.noarch.rpm"
RPM_HASH = "31d6e6d9199b204e7019c58474f9b08ede44f28adef94be3f45a0140c2b779e7a5fc501f7cf975a0881de733409e16bb5f61bc0b3feac17b7b7cf55659f5e4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Smart--Comments \
perl-Smart-Comments"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
