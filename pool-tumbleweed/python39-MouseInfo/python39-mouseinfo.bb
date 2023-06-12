SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python39-MouseInfo-0.1.3-1.12.noarch.rpm"
RPM_HASH = "5cada19e0970376400c8b892fcb02e96c7b9909865a9fc5cf2327332cb2d10aec85f14ba22353d473cf8cae9db7f7227e3ce07a0c1a7fa209e4964d99f236c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mouseinfo) \
python39-MouseInfo \
python3dist(mouseinfo)"
RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-pyperclip"

inherit rpm
