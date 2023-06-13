SUMMARY = "The Wine specific Gecko HTML rendering engine"
DESCRIPTION = "This package contains the prepackaged Win32 Gecko rendering engine for use by Wine."
LICENSE = "MPL-1.1+"

PV = "2.47.4"

RPM_NAME = "wine-gecko-2.47.4-1.1.noarch.rpm"
RPM_HASH = "2074c9b357a8a6a45f999d842f888e780241c5773c27bed05848f41151d0917afab9df6c504117fcb389c36acef175417a785f4ccc75d1ad144c346c3469e31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-gecko"

RDEPENDS:${PN} += ""

inherit rpm
