SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-rich-click-1.6.1-1.3.noarch.rpm"
RPM_HASH = "6dd10bb6ace635962744fadf669c50b9f6d50acaef5fb681e19669b133bd94c9a8ee6927c9a73106d2406462d76e9222e8c92aa3246dd191895a39709c46a285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rich-click \
python310-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-rich"

inherit rpm
