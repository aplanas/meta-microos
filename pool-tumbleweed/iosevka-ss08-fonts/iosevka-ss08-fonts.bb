SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss08-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "1d57e9e6b0163836b53711c1c9948fc31e35a81e1d099078b2160e83e1f57465c15346cef2c168446ba0894f3f5d7d8c0cd70263ddefb843f52e3b7837b1d7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
