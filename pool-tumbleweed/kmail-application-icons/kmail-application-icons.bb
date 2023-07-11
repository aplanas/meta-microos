SUMMARY = "mail client icon"
DESCRIPTION = "The KMail application icon that is shared with a number of applications"
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kmail-application-icons-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d19596bf4f5bf66f3e92e31e2f318ea4e2dd291cd88058f70e8e0325f8f225fadd585f99383d7285bdb6c4e3245c0f62f9b6de521fada104c99148419d14628f"

RPROVIDES:${PN} += "kmail-application-icons"

RDEPENDS:${PN} += ""

inherit rpm
