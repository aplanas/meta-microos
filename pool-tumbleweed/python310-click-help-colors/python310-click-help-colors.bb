SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-click-help-colors-0.9.1-2.3.noarch.rpm"
RPM_HASH = "df234f0e382219bc1c7893fe0809fdd58f7e3bbb2d0d197bcb60527cbb398a7fe9cd5c5e14b985f2855df75bd4db3c7272f34168e23069c5aec4a326e4435bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-help-colors \
python310-click-help-colors \
python3dist-click-help-colors"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
