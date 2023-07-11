SUMMARY = "Documentation for the universal TLS Tunnel"
DESCRIPTION = "This package contains additional documentation for the stunnel program."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "stunnel-doc-5.69-2.2.noarch.rpm"
RPM_HASH = "4218ceeb2d236c2c1ef95bf71e7663396193b52de83e5c17e0c8e008855a94f0bfd19c83fe5d403e46787bac9d33fbac22107870badb318971e2929868000760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stunnel-doc"

RDEPENDS:${PN} += "stunnel"

inherit rpm
