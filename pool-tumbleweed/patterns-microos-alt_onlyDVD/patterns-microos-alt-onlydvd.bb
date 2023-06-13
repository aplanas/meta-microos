SUMMARY = "Alternative Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Alternative additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-alt_onlyDVD-5.0-70.1.aarch64.rpm"
RPM_HASH = "f6972127858d94af05906651654307de14609c8a55aa51de3a8289f29d733c332761d9483c82442fdb4713c97120934103e454456e0a71b6925c760198855cb2"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-microos-alt_onlyDVD \
patterns-microos-alt_onlyDVD(aarch-64)"

RDEPENDS:${PN} += "kernel-default-base \
pattern()"

inherit rpm
