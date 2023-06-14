SUMMARY = "Easily Readable Sans Serif Font"
DESCRIPTION = "Allerta is an open source typeface designed for use in \
signage. Allerta was designed to be easily and quickly \
read from a distance. Each letter exploits the most \
unique aspects of that individual letter so that each \
character can be easily distinguished from any other. \
 \
Allerta has been released as an open source project so \
that those countries, communities, and/or organizations \
without a proper signage system may have a way of quickly \
designing and implementing one. While Allerta is complete \
with a large character set, because it is open source, \
modification and expansion is encouraged. \
 \
For the more urgent of circumstances, Allerta Stencil \
and an accompanying kit have been designed so that signage \
can be created with nothing more than the kit of letters, a \
can of spray paint, and the nearest available substrate. \
Although the stencil kit may allude the finer points of \
typographic spacing, it is intended to serve the most basic \
purpose of signage: guiding people towards their destination \
or towards assistance. \
 \
The name Allerta is derived from the origins of the word \
alert (adj. swift, v. to advise or warn). The Italian origin \
all'erta literally means on the lookout. \
 \
Designer: Matt McInerney"
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "google-allerta-fonts-1.0-11.17.noarch.rpm"
RPM_HASH = "6264c228ef9f64cfefe61a0c2534e136e0529a706c60c2fd9dd8eb7599e064389496bf79582f275655bbf25fce25bf36b631e815af1864a9514e747795f6907a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-allerta-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
