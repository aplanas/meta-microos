SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python39-serverfiles-0.3.1-1.8.noarch.rpm"
RPM_HASH = "551d954662d6222dd2ce2bc2de853906094ac4bdc55b5b941642d4c69b5fa39ab6a365fd996e2bb47b466dd3584c5a14e7c3b5668671151d063bbda07872c2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-serverfiles \
python39-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
