SUMMARY = "dummy scriptlets for the kernel"
DESCRIPTION = "Empty scriptlets to satisfy kernel dependencies"
LICENSE = "MIT"

PV = "1+git20230717.dac075e"

RPM_NAME = "sdbootutil-rpm-scriptlets-1+git20230717.dac075e-1.1.aarch64.rpm"
RPM_HASH = "4b31e44cbf6db23d4e7002852974c216a8bb3576b0c72dbca1959ebc548639a03ca9bfba2b9b3d4093bc836455c260350b7a3b31bf6659bcb1bf0a50c263e875"

RPROVIDES:${PN} += "sdbootutil-rpm-scriptlets \
suse-kernel-rpm-scriptlets"

RDEPENDS:${PN} += "sdbootutil-filetriggers"

inherit rpm
