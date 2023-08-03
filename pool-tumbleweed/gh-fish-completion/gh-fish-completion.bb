SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.32.1"

RPM_NAME = "gh-fish-completion-2.32.1-1.1.noarch.rpm"
RPM_HASH = "5ed37b4ea4fdfddfc7ff282422d61a7c7666e9f76bcf636dc209ec62c60e55d657d2aaa963711486aeea7f8860e24791acedb5dbf9699e8fab7b3fe5926b73f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
