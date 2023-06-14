SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python310-pygments-style-railscasts-0.3-1.17.noarch.rpm"
RPM_HASH = "f9c08c6513f717e39a19c53fdd0b3f632a53cbcd2ba5fa78299478417f04ad1faf06676b0a6b571341137aea989ef535a339a4f79455be2a206fa4f4563c7286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-style-railscasts \
python3.10dist-pygments-style-railscasts \
python310-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python310-pygments"

inherit rpm
