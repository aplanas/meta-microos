SUMMARY = "Collection of LPEG patterns"
DESCRIPTION = "A collection of LPEG patterns \
 \
Use cases: \
 * Strict validation of user input \
 * Searching free-form input"
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "lua53-lpeg_patterns-0.5-2.7.noarch.rpm"
RPM_HASH = "d22d0634edf3cbae97f7a6c6656b8e33f491be128a1ef39bf6f664c39f99444943a8e399413918721cd4afe8db755099a4de536edf34330030cc267d593b3330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-lpeg_patterns"

RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
