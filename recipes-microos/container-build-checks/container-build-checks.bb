SUMMARY = "Scripts to validate built container images"
DESCRIPTION = "This tool checks that built container images conform to the openSUSE container \
image policies (https://en.opensuse.org/Building_derived_containers)."
LICENSE = "GPL-2.0-or-later"

PV = "1682595397.5ce6d2f"

RPM_NAME = "container-build-checks-1682595397.5ce6d2f-1.1.noarch.rpm"
RPM_HASH = "1e467cadf047f87a61f36d3f4c93044f68a780bbcc692f6f04e9a6a73b43080046ff43c6ad13a41221b425cbf419b0048eb625f1c83ba78205c44c9ca8ea1d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks"
RDEPENDS:${PN} += "/usr/bin/python3 container-build-checks-vendor"

inherit rpm
