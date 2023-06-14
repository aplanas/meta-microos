SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python311-pkgconfig-1.5.5-1.7.noarch.rpm"
RPM_HASH = "2537f3c27e7b3ffc6719df05a69821e6e3573edaae7a15780fbe17d91cde96244de810a944217228394a12d9a1dd50f331d1eebd7f8b528cd269dd4152e4ed4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pkgconfig \
python311-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
