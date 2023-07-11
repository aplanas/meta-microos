SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-sdnotify-0.3.2-2.9.noarch.rpm"
RPM_HASH = "8ad9a368e90003f8da1f8fdb92c08c3997fd951564979e09903026b78aacd2f7aee6c933e5b8671ff4e44c34c66e8096f3e645ebd7e689729e5b9a221dfdd5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sdnotify \
python39-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
