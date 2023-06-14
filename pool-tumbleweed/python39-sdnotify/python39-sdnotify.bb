SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-sdnotify-0.3.2-2.7.noarch.rpm"
RPM_HASH = "69fa6aef8ffe8fe3201d7e2516135281441a01b202a333fed1a019772b0feac25e0bedf2103afb4b076e462709df9f81cdeea4c8fafbc695cb53e8ea2dafb0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sdnotify \
python39-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
