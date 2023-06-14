SUMMARY = "YaST Desktop Utilities"
DESCRIPTION = "YaST tools for desktop system administration."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-yast2_desktop-20220411-1.4.aarch64.rpm"
RPM_HASH = "7fec22f775afc2ce180e7b0cd607087143a6e1718e8465dccd3ea70dc80c9bdc14c5e004cfd5ee529f957628b073862fc1df2f3646f535b57dd3b76640061eae"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-yast2-desktop"

RDEPENDS:${PN} += "yast2-country \
yast2-installation \
yast2-services-manager \
yast2-sysconfig \
yast2-users"

inherit rpm
