SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-docker-20230707-1726.1.aarch64.rpm"
RPM_HASH = "14e4409ebbc15a3e046bbaad15988026596bdbff9a2f66206754ae5e4af68654f8f13a0175e0b93ef104aa64cbe3522372396759d633d93d0ebf222c044975a5"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
