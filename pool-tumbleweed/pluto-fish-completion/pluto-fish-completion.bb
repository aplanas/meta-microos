SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.0"

RPM_NAME = "pluto-fish-completion-5.18.0-1.1.noarch.rpm"
RPM_HASH = "5fc7a9b48f14bc9b8cc0476e77a1a7c3e46d1727dfc772cd548182e0efbe9b5834f542786abe2f4280296fe345cb323e763d4f00c5b1b32e5145542fd5494660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
