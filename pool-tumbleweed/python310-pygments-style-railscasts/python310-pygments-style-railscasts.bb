SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python310-pygments-style-railscasts-0.3-1.18.noarch.rpm"
RPM_HASH = "674745b2e8a5c24a80d10054010e3de1efc340536aef30e8d9e0a3d0384964ad452cc138fbdd0e2e732b507e94d47d117db2da767a22dca256b2861693d78ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygments-style-railscasts \
python310-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python310-pygments"

inherit rpm
