SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-schedule-1.1.0-3.8.noarch.rpm"
RPM_HASH = "7e48ae148c3c682b87f09cfa4c7a5ce2174142bcda2c6294c6cd9fe402c82668308d1ad090ed2e9ff38872954260b555babfb3de03fc397edabc5b11d0870e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-schedule \
python39-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
