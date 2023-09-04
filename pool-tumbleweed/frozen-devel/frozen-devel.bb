SUMMARY = "Header files for frozen, an alternative to gperf"
DESCRIPTION = "Header-only library that provides 0 cost initialization for immutable \
containers, fixed-size containers, and various algorithms. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "frozen-devel-1.1.1-1.1.noarch.rpm"
RPM_HASH = "aba2db60e03626bbda0cba6d6444b7b77097a89ca0958fdfca0d8790775b62a3ff6a19cded12859030b201c4ca747c5a971b4cd152290c9b83a54b01d3caa9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-frozen \
frozen-devel"

RDEPENDS:${PN} += ""

inherit rpm
