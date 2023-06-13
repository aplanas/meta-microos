SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python39-robot-detection-0.4.0-2.8.noarch.rpm"
RPM_HASH = "c44717de496bf8902749ae660a4fd7f72aa0a45b49cad43bfa580a70ae9670cb990411a7a47f7121d8f641976aca753d8ef1b7bbb1bd2e9554d65167342b67c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(robot-detection) \
python39-robot-detection \
python3dist(robot-detection)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
