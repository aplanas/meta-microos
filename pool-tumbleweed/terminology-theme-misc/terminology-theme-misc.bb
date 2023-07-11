SUMMARY = "Miscellaneous terminology themes"
DESCRIPTION = "Miscellaneous themes provided by the terminology devs, includes Solarized, \
Mild and Black themes."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-misc-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "227a2ca77ab82c3d9fdbceee514170f99e1b42b9a96689dd625e82e54f0f42e8cf7e82bf146f4a924775ec3ef999f21c301d5717507cfa05ca62686e211e6141"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-misc"

RDEPENDS:${PN} += ""

inherit rpm
