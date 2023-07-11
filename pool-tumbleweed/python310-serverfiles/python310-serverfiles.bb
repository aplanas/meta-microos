SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python310-serverfiles-0.3.1-1.10.noarch.rpm"
RPM_HASH = "ea859d5bb5b863235b21fead54ac8f7074761a5931459b62627bca199340ee850a49ede0e85fd9568b6fb00d5ffba3f6c9e3db7d42056c307cb8adefe4b2b3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-serverfiles \
python310-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
