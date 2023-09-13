SUMMARY = "Fish Completion for timoni"
DESCRIPTION = "Fish command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "timoni-fish-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "1aac0ae5a93313e0fb13257d73cc36f4bf2dc72dd47fe419aff3e15d2d2eb790b4199b50b7002e8c9bd42fb51600fd243549fdcb7f21c25eaa59604421bf4a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-fish-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
