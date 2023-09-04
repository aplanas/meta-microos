SUMMARY = "Check for memory leaks and circular memory references"
DESCRIPTION = "Check for memory leaks and circular memory references"
LICENSE = "Artistic-2.0"

PV = "1.06"

RPM_NAME = "perl-Test-Memory-Cycle-1.06-2.27.noarch.rpm"
RPM_HASH = "2aea859a36231ff84f5f39f81ea02c83f7d091f1588220e2855222099ef1e6516af6a031c3e5022a1931100231edd5dbfd6b476233a406b3ce6f0a389877146b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Memory--Cycle \
perl-Test-Memory-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--Cycle \
perl-PadWalker"

inherit rpm
