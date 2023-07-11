SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python310-MouseInfo-0.1.3-1.14.noarch.rpm"
RPM_HASH = "b246a673dc2e5623fb332f0d4a2250ebe8861366148408e3d6072f76de2e269130081d32533b243593e68a31fc213b899b2a87ab72e44cfd99a0fe61317031be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mouseinfo \
python310-MouseInfo \
python3dist-mouseinfo"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-pyperclip"

inherit rpm
