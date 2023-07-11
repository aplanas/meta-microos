SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.20220715.0"

RPM_NAME = "python311-pypng-0.20220715.0-1.1.noarch.rpm"
RPM_HASH = "3282b063a399af1b733ae8dd86422fede51f8ff19bd5a18dc36eb88a453fbcea833bfea25150c3e54076c632a985abc1a0be08715b89504dcbc4d252c9b49b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypng \
python3.11dist-pypng \
python311-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
