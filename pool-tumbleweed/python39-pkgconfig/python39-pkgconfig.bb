SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "python39-pkgconfig-1.5.5-2.3.noarch.rpm"
RPM_HASH = "b04ac354e4ae9b93d11cf6b11f78d47ce1c663c7edee5b1cca455f75df59fda425ece9c34e7c77c3e0de3729868ab2d1ccb2836d7c5385ae3bae3cee6709cc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pkgconfig \
python39-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
