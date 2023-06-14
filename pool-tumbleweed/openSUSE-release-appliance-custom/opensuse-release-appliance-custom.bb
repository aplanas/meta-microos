SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-custom-20230604-1684.1.aarch64.rpm"
RPM_HASH = "60792d934115c3cf1ee7759a3e12d87e759655de272c234a9af49fa7347e6e4e7d6acf964f092797745edb9ef6cada2d10eb2188140c6ca1836684488b649528"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
