SUMMARY = "SUSE configuration for container-build-checks"
DESCRIPTION = "SUSE configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1682595397.5ce6d2f"

RPM_NAME = "container-build-checks-vendor-SUSE-1682595397.5ce6d2f-1.1.noarch.rpm"
RPM_HASH = "4e27f110d7af26d4fe6b4a50f2d6084a0cb308524d227b951a780e2b1925f1cb145d4b41db5d2f0340c479a7e5a6325b5967b828ccd3f9987be55d38adcf1192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-vendor container-build-checks-vendor-SUSE"
RDEPENDS:${PN} += "container-build-checks"

inherit rpm
