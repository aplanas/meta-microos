SUMMARY = "Smooth-edge version of Fixedsys Excelsior"
DESCRIPTION = "Smooth-edge versions of the Fixedsys Excelsior font."
LICENSE = "SUSE-Public-Domain"

PV = "3.02.9.1"

RPM_NAME = "consoleet-fixedsys-fonts-3.02.9.1-1.1.noarch.rpm"
RPM_HASH = "5db0a82d7252676e903752861084a6a3bbe6aead66640c9966faf80498e68bdb509905b6215a87ac49837902afa585a1b37618591b86a77808645851ab5c711c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-fixedsys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
