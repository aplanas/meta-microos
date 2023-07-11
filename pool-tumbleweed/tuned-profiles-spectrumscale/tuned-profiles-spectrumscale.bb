SUMMARY = "Additional tuned profile(s) optimized for IBM Spectrum Scale"
DESCRIPTION = "Additional tuned profile(s) optimized for IBM Spectrum Scale."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-spectrumscale-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "4b48bc5706583db82d2558be3e297d13e280596a98d5bfbed18e49a6c89ee4855a0b72f91478f4b3338e68b7dff2664911b55ecc9a1f615ca01cd45b649904e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-spectrumscale"

RDEPENDS:${PN} += "tuned"

inherit rpm
