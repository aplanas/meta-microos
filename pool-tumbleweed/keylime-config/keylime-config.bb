SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-config-7.5.0-1.1.noarch.rpm"
RPM_HASH = "eb164f4557faa0d1c901eaa730b2cfe989f30d22848f8daac5d21a94862bd5e0d73a285f5c0e431e13237937c3ae51ad15aaed65c8e27d194aff448d3715206a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"

RDEPENDS:${PN} += "python3-keylime"

inherit rpm
