SUMMARY = "Additional tuned profile(s) optimized for IBM Spectrum Scale"
DESCRIPTION = "Additional tuned profile(s) optimized for IBM Spectrum Scale."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-spectrumscale-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "d49f8dfafb18b5e46f5fa19bf8e94327a40d0edb33428dec0f59cf9ab3470f16476f279d01b538368d7645856ee8fa4db5efad71170470aa8bf2544bcf376ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-spectrumscale"

RDEPENDS:${PN} += "tuned"

inherit rpm
