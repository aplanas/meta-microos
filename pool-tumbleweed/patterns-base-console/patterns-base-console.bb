SUMMARY = "Console Tools"
DESCRIPTION = "Applications useful for those using the console and no graphical desktop environment."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-console-20200505-42.1.aarch64.rpm"
RPM_HASH = "cfadd0aa758bde96030139807c3a4a664e79e250e49894e0dfa0aa56c53a6da5eb9fe4682a5100cd2af48c9dcf950ec618ec1e9a246e9981d820bfd12ab6e7d6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-console \
patterns-openSUSE-console"

RDEPENDS:${PN} += "pattern-"

inherit rpm
