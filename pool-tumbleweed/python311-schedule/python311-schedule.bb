SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-schedule-1.1.0-3.8.noarch.rpm"
RPM_HASH = "f000524c9f941891762ad81d8afd161474ff5e08d06453ab9b2884242a7124d47f03d86900e6f40cd1f98233f423f5e8fd7b210789f3d286dd397c8159e2454f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schedule \
python3.11dist-schedule \
python311-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
