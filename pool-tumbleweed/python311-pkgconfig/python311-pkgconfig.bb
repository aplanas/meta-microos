SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python311-pkgconfig-1.5.5-2.3.noarch.rpm"
RPM_HASH = "ec407b1af72c870f0f6f3d94f7e01ff47c175d43adeb1d9a6b51bc03a1af51431bf124a8220c580d468cf354cb84bbf0db8ce9a8e110174c1a02eb05e9c03ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkgconfig \
python3.11dist-pkgconfig \
python311-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
