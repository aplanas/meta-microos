SUMMARY = "Perl Development"
DESCRIPTION = "Tools and libraries for software development using the Perl programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-perl-devel_perl-20170319-2.13.aarch64.rpm"
RPM_HASH = "94c46602184832db6742a8ae7f6c21e9cfc78d4c52642f03d43ab3c467137006453ad08bf67e9b18557302f85739745305599244246561e9dc24f313e23c58f1"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-perl-devel_perl \
patterns-devel-perl-devel_perl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
