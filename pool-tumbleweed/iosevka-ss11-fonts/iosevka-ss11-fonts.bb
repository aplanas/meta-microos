SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss11-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "a3087a08b97884d96711c5a8d344105969a4b44bf2015cd021bc7bdb0ceceba6143a46885b00e537be596ab8181e00abbd72ec37630a215c388b4d756f85f51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
