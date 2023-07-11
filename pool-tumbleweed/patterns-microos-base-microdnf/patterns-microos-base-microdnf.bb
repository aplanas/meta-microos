SUMMARY = "openSUSE MicroOS using Micro DNF"
DESCRIPTION = "This is the openSUSE MicroOS runtime system using the Micro DNF package manager. \
It contains only a minimal multiuser booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-microdnf-5.0-72.1.aarch64.rpm"
RPM_HASH = "9e4877b4cbb980b096959ddc49b06aa4492a67ef46028f8e5d47314eded41096624560265dd4fac555d07d915a3aedc811fba90f3c65c145acac513eeae131c3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base-microdnf"

RDEPENDS:${PN} += "libdnf-plugin-txnupd \
microdnf \
pattern-"

inherit rpm
