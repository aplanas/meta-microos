SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python311-xcffib-1.3.0-1.3.noarch.rpm"
RPM_HASH = "4bf27325bb2f0e4d51b9631999ff2d5dfb8591e02de0736a8afee9a75b9f03c8cd2db6b7523254d0ea29fad1f84339ab29945458fba9c6992fe8f450c9a08268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xcffib \
python3.11dist-xcffib \
python311-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python311-cffi"

inherit rpm
