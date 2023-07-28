SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss13-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "bf6b1f9a37c63d890a3df207f8a0cebeb9e7d21a14445c08e519ab1cbfcf840ae5fff1648e17e81fc8225239c776b932f9ddbb837d48815ffa640071d80a3587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
