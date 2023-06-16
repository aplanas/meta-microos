SUMMARY = "GUI front-end of fontconfig"
DESCRIPTION = "A front-end for fontconfig. Setup perfect font effects, fast and easily. \
 \
* Choose fonts by font family and language \
* Combine English font and Chinese font \
* Setup font render options, including hinting, antialias, subpixel rendering \
* Font replacement. Use installed fonts render missing fonts. \
* Scheme management, 1-click setup and Reset system default functions."
LICENSE = "GPL-3.0+"

PV = "1.3.1"

RPM_NAME = "fontweak-1.3.1-2.20.noarch.rpm"
RPM_HASH = "6f5c61735e641d832c4218e391cc85c4a4c8f0062d33309c5cbf017a3775562eaba375806b1db9efb3e59ab64b477755f8394a7930a3e75a5585ce1a0b209bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontweak"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
