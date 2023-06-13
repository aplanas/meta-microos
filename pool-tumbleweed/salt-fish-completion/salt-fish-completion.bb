SUMMARY = "Fish Completion for salt"
DESCRIPTION = "Fish command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-fish-completion-3006.0-1.1.noarch.rpm"
RPM_HASH = "b1d8e94ef1a39d3dea2fe497af14fae479289d0567e1fba91e71b2932bc993ba6237535b4ca822a7f0e4be471fcd781d7143b09636bc8fdab876eba71da6a8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-fish-completion"

RDEPENDS:${PN} += "salt"

inherit rpm
