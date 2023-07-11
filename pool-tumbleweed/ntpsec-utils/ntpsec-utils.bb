SUMMARY = "Utilities and commands for ntp"
DESCRIPTION = "The ntpsec utilities relying on the python module of ntp"
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-utils-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "c1d10bb74f01a225e1e025750a0f879d78a738c05afa1b5ce9f4fddc28c64bded538dab2e7f1fca964c7ec028397e27e2c9da0818bbae0f81ec8f18f4d461b20"

RPROVIDES:${PN} += "ntpsec-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ntpsec \
python3-curses \
python3-gpsd \
python3-ntp"

inherit rpm
