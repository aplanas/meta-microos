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

RPM_NAME = "perl-Smart-Comments-1.06-1.26.noarch.rpm"
RPM_HASH = "484ac796edb1611bc8c6be6db501c484931b33d18c939ff36adc18f9fe94f52ab44021d1e3fcd70ff48456615e0c213716eaf1bed6ce58725b55c391701b7559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Smart--Comments \
perl-Smart-Comments"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
