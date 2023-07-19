SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230716-1738.1.aarch64.rpm"
RPM_HASH = "6e01bd66def658d6762622a854bb53ca366a75e02322b0f673db16df8f54c4f2e2b5b727a740e16a69a53be1705156d94a70cb7353f143e1de4e514c288ffa53"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
