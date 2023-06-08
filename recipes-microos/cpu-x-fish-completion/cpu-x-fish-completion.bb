SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-fish-completion-4.5.3-1.1.noarch.rpm"
RPM_HASH = "21b5d3e001d08718844e7f763c5758f9adddb0cfe0f0bc046fd70d91f16ec06d2084f554bb62fdf60962004982ceb6f634157ccd25be142c0510706ccce173f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
