SUMMARY = "Fish Completion for melange"
DESCRIPTION = "Fish command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-fish-completion-0.3.2-1.3.noarch.rpm"
RPM_HASH = "cbb24fcb00493c9ac10a5ef3fe0d35b021ca2b1ae6dcf9f70f1994655f25bf8b70a40a81a78bf5a2805161b72683ae93733de74bc0997191938a107c0b3aeb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-fish-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
