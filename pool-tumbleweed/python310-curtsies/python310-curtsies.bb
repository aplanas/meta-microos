SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-curtsies-0.4.1-1.5.noarch.rpm"
RPM_HASH = "34a5aa8d4a6358fdac3952321d71e6c6e4c4ef8e875284a91da790fcb58a21c417669b1cbeeadb714683e9b76a8841083be959cb47eff49080548dcadc6e3553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-curtsies \
python310-curtsies \
python3dist-curtsies"

RDEPENDS:${PN} += "python-abi \
python310-blessed \
python310-cwcwidth"

inherit rpm
