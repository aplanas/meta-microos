SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-tenant-7.2.5-1.3.noarch.rpm"
RPM_HASH = "95fffcae44b30e96192ff353c7f022555549023c00a7f4227a78975ccf52ec32931e6874fd2074ac6f981860bf10babed2f34ea22183e8bdd632a64c29662548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "keylime-config \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
