SUMMARY = "Fish Completion for salt"
DESCRIPTION = "Fish command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-fish-completion-3006.0-1.4.noarch.rpm"
RPM_HASH = "42945ead5c39bf056fb08b2d72bad46e0682f67a9edc5bd839b9eacbcc1e14677c8d5f2165e9318447c7586d1bced52aba756de9358415ebcf513024b240f040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-fish-completion"

RDEPENDS:${PN} += "salt"

inherit rpm
