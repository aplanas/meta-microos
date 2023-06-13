SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-prestera-20230517-1.1.noarch.rpm"
RPM_HASH = "c8dd78b594663e22c187abea88930d8734629439affbe58fabdf72f7750dc6adfaceb68ac65e8fa455eb7d6675e6ff9fbb7a1e08ff592fcca5871f6c6db88697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(mrvl/prestera/mvsw_prestera_fw-v2.0.img) \
firmware(mrvl/prestera/mvsw_prestera_fw-v3.0.img) \
firmware(mrvl/prestera/mvsw_prestera_fw-v4.0.img) \
firmware(mrvl/prestera/mvsw_prestera_fw-v4.1.img) \
firmware(mrvl/prestera/mvsw_prestera_fw_arm64-v4.1.img) \
kernel-firmware-prestera"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
