SUMMARY = "The Lifelines Genealogy Program"
DESCRIPTION = "Lifelines is terminal-based program that allows the tracking of \
genealogical information.  The lifelines reports are the power of the \
system but requires knowledge in the ll format."
LICENSE = "MIT"

PV = "3.1.1+3ad4571"

RPM_NAME = "lifelines-3.1.1+3ad4571-4.1.aarch64.rpm"
RPM_HASH = "a61e481c8225d97c8f7211042ff9aa776d3a2a4d7e86a49590ed5caaf84ec2ebc9b617aab9e5427c6606ed44b2113cb87757d2078e4c9b52c09d3d2adf8eaf31"

RPROVIDES:${PN} += "config-lifelines \
lifelines"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
