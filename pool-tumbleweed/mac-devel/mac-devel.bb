SUMMARY = "Development files for APE"
DESCRIPTION = "Development files for Monkey's Audio codec and decompressor."
LICENSE = "SUSE-Permissive"

PV = "8.92"

RPM_NAME = "mac-devel-8.92-1.4.noarch.rpm"
RPM_HASH = "70fe93b1f519ab22271991a6173d038acfb65dee3a43705529b37ef21adccf493d439563694c2777f293a3f79626e2c5894ebc2dbac170d9fa926db468bf4821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mac-devel"

RDEPENDS:${PN} += "mac"

inherit rpm
