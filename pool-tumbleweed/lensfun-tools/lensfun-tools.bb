SUMMARY = "Tools for managing lensfun data"
DESCRIPTION = "This package contains tools to fetch lens database updates and manage lens \
adapters in lensfun."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-tools-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "d3b36ce88ebc172e5a0e7881f7fb40a22efbdfe460c608f3edbe2adb7fc4f78240464637f8e2ee5163808de9cdf6daeb88391a259e57220fb1c9c02f3caeff42"

RPROVIDES:${PN} += "lensfun-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
lensfun-data \
python3-lensfun"

inherit rpm
