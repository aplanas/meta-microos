SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "52f1c9285a434d439b735aa054aa7bc564e19a264e030ba698d672b80410a5fb1967eee2a78d8e86918cd5b4553a30d40831bef0f63168899a7dcc72094d398d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"
RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts \
plymouth-theme-spinner"

inherit rpm
