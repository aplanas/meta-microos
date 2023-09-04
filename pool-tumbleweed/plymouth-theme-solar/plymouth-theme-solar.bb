SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "37bef14fa4bc5a76bfd9da940fd380824d51ae9d80305e642f601ab782528956a7bf648a62835dfd8f2d784835b0cab82d807002971db151d9a3c2951a959eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-space-flares \
plymouth-scripts"

inherit rpm
