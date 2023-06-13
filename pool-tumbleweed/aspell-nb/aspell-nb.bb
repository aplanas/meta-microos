SUMMARY = "Norwegian Bokmaal (Norsk bokmål) Dictionary for Aspell"
DESCRIPTION = "A Norwegian Bokmaal (Norsk bokmål) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.10"

RPM_NAME = "aspell-nb-0.50.10-2.14.aarch64.rpm"
RPM_HASH = "abf8bf0cfb7645e633ad340ce26a3c4cf2f5764b0fe0caf8ad39982c9f98b9fc0c0f12c3330353763e1a6c499d0d1a175b189ed1efad5c580ae8e251cb7d18cb"

RPROVIDES:${PN} += "aspell-nb \
aspell-nb(aarch-64) \
aspell-no \
locale(aspell:nb)"

RDEPENDS:${PN} += ""

inherit rpm
