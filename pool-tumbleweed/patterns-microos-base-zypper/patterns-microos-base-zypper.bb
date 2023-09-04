SUMMARY = "openSUSE MicroOS using Zypper"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Zypper package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-zypper-5.0-73.1.aarch64.rpm"
RPM_HASH = "7677bfead18dda5287f2c5860a7ad4d731768b8febc62f78b626b69b8a4475b49a99b22288ff9eea4d7e8e37af3ead97881f41f0c023056d23f35b0d59457c95"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-zypper"

RDEPENDS:${PN} += "pattern- \
transactional-update \
transactional-update-zypp-config \
zypper \
zypper-needs-restarting"

inherit rpm
