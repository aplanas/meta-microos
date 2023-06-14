SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-schedule-1.1.0-3.6.noarch.rpm"
RPM_HASH = "a8a5862dae1e408c2de20cacc289e7a7f9c0d56f5b5587f2d83be8621e1175c6ffff67e2166cf244a561263ba6a757d391de972140986b9ac158920931a49cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schedule \
python3.10dist-schedule \
python310-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
