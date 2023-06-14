SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-race-1.17.13-5.1.aarch64.rpm"
RPM_HASH = "a6617bc73116692d9da4899d0af9371fe552e79eec9446381b10bdecf8507134d5dfe44000219067b0518769f916e41691ae09feecd4b4b01e31b432c9bec948"

RPROVIDES:${PN} += "go1.17-race"

RDEPENDS:${PN} += "go1.17"

inherit rpm
