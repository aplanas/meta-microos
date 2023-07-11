SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python311-MouseInfo-0.1.3-1.14.noarch.rpm"
RPM_HASH = "47f50b33fa7c64b8b7e41f7df43b579dfd2a857fdea8206888c6ddd3f3311f8730760132740fe1d34e4f02b41cb61cdc0c31f2371291d16a3dbd3e4831c4a536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MouseInfo \
python3.11dist-mouseinfo \
python311-MouseInfo \
python3dist-mouseinfo"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-pyperclip"

inherit rpm
