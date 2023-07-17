SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230712-1733.1.aarch64.rpm"
RPM_HASH = "daeded0d4ed6ae896bb8cc830d89f82edd2610fe9015274cd932e7046cb6589bcc07d635ac1e37337dec69dd6f722a9baea863a1750b41d30ca4ad32771c144e"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
