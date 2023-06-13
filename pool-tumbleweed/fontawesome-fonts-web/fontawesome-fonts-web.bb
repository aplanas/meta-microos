SUMMARY = "Web files for font-awesome"
DESCRIPTION = "Web files (css, less, scss, etc) for font-awesome."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "fontawesome-fonts-web-6.4.0-1.1.noarch.rpm"
RPM_HASH = "db23e9def902077b24acf28739948f43ac4c54883c17f1ea286295d452a91c78440c8d92567bf28c375e372066ee3fad41dcf1bb5ed5cc889654b7735ed86c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts-web"

RDEPENDS:${PN} += ""

inherit rpm
