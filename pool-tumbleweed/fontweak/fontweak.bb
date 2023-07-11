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

RPM_NAME = "fontweak-1.3.1-2.21.noarch.rpm"
RPM_HASH = "f16cec9ba42e44f0919168191ad5a5dc401eb80994a9e001a7c6db80fc9fa477e58400bc7626a868add5b48109d811203ad360330f2d89b65890cb0cd289eaaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontweak"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
