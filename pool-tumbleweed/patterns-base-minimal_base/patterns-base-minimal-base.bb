SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "This is the minimal runtime system. It is really a minimal system. It is intended as base for Appliances."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-20200505-42.1.aarch64.rpm"
RPM_HASH = "5ea3548d726feda41dff5b59313069e26fbe23375aa4f49de3afcf57d08572b15bc38e6ca6cf04dee2b7791b07ec5794a34266f0979839776374efff6a9c67ea"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-minimal-base \
patterns-openSUSE-minimal-base"

RDEPENDS:${PN} += "branding \
build-key \
distribution-release \
filesystem"

inherit rpm
