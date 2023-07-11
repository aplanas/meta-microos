SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-slab-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "f46cbab7a145bf31c7ea749f6edab7139e5e8bfdf937f797efdcb477c202760b4e044263506c0608cb1d8fad3ad020683caa52a3600ed14c8a53280d10d1c38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
