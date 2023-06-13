SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "A compatibility layer allowing applications written for libudunits to \
work with libudunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-2.2.28-1.8.aarch64.rpm"
RPM_HASH = "4c4cbbe001aee0b52ee193699710f627511ea7154adee7ccda0e55fe864d6dc34cfd77f7b9263731bafcb11f6b166cf7a954b1f801d9935b0914c43a4d64e4e3"

RPROVIDES:${PN} += "udunits \
udunits-compat \
udunits-compat(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
udunits2"

inherit rpm
