SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-schedule-1.1.0-3.8.noarch.rpm"
RPM_HASH = "e7ef374296e2e8f88a95dfb5cf8f8d44dc1f2b10a949db21716e544e4973d6ee40e3fafe4717e8bc30a1ef29a26af4dea90f0985adc1928ea276b4a2ee5caf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-schedule \
python310-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
