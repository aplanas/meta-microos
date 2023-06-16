SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python311-nkdfu-0.2-1.1.noarch.rpm"
RPM_HASH = "febf95c8e60ab15f8f396c733214cbd4172a5299e352f2ec91c075420b278b16f103f96995207b28c80efa4ec4fc59440518911ce5103c6b9c4bbf765357f84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nkdfu \
python311-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
intelhex \
python-abi \
python311-fire \
python311-libusb1 \
python311-tqdm \
update-alternatives"

inherit rpm
