SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python310-serverfiles-0.3.1-1.8.noarch.rpm"
RPM_HASH = "eb4a485a182ad916343834152eadf79703afd11ee18c6a6c2cfccc91acf1e7e0ce2e0208ac52afa2f6dbc311c7383710aaef8d78a3b8b95287d19e021efff672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serverfiles \
python3.10dist(serverfiles) \
python310-serverfiles \
python3dist(serverfiles)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
