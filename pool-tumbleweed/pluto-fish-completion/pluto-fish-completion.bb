SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.16.4"

RPM_NAME = "pluto-fish-completion-5.16.4-1.1.noarch.rpm"
RPM_HASH = "d6c3dea8e4b2e7ae0f8430163fb0de2eb80963dc5595bd8892532d8c24a1ffa8e9ae557aedc402e93711c914363c6825e219913abd641df02dd4a54defb6d1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
