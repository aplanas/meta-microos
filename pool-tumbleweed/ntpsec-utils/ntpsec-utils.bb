SUMMARY = "Utilities and commands for ntp"
DESCRIPTION = "The ntpsec utilities relying on the python module of ntp"
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-utils-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "13adbb9c267662093581d28b2d4bb0a4b3a61b31f26780c096d17555bcb5ba71377ec2f8e7179539f6b496ac042cc57e0b90a3b60ebae18dfcc58b70354109c3"

RPROVIDES:${PN} += "ntpsec-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ntpsec \
python3-curses \
python3-gpsd \
python3-ntp"

inherit rpm
