SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python310-pkgconfig-1.5.5-2.3.noarch.rpm"
RPM_HASH = "44a61cf2d139364168c10730026f598d325105432be6a471ea3824c8e3719cc93415a5bbce3219680ddbfb301ba31ac4508b7ef5a4f2a2a02aa04149f401ad4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pkgconfig \
python310-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
