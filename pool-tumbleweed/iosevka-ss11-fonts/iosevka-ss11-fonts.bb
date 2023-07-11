SUMMARY = "Iosevka in monospace, X Windows Fixed style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS11 typeface (monospace, X Windows Fixed \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss11-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "39913f17c803d3078663d546bae1415e592b6a50bbebafff1cfc095fc9f7adb6297d6533f0c4abc087ec311d4bc40ee319397621d8eaeb6c062d359712877a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss11-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
