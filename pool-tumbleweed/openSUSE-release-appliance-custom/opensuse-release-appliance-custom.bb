SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-custom-20230910-1810.1.aarch64.rpm"
RPM_HASH = "a73a19c53cb53a654bb76226dcb418e54fe9e0419bd1c24ced27fd13e79cd14282184390ffaa6d0db43d65fc53e72b83bd8efdeb7bbddde49d42e3bfc22a4888"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
