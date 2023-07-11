SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python39-nkdfu-0.2-1.3.noarch.rpm"
RPM_HASH = "fab769254a093cec8be104f857eeaa55d92bbcffe031c15f9965067816ed0ebdb6ffc6494f22ee06ec44e5f3927847d65781e7def6a3e30ee297d51b3729b075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nkdfu \
python39-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
intelhex \
python-abi \
python39-fire \
python39-libusb1 \
python39-tqdm \
update-alternatives"

inherit rpm
