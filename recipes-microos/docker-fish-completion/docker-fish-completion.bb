SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.6_ce"

RPM_NAME = "docker-fish-completion-23.0.6_ce-1.1.noarch.rpm"
RPM_HASH = "328c0aee735857d7dada3690dbdd1dc9049ed0fd031d754303c19ceece39daab84c9f43cc3c1689bbb438d4df6176b51ece3ce9a1bf57e964c290fb6d0e814a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"
RDEPENDS:${PN} += "docker fish"

inherit rpm
