SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-docker-20230902-1800.1.aarch64.rpm"
RPM_HASH = "b0501d92eddbe0a74f0768897b058e6c8f836791f2abe3a71a3c7c4694adf012b6d87a08951fe57e3b38c40ec23ea49f4374c61ea9bb880ad72a96c60d8caf86"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
