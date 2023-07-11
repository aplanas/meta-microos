SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python39-croniter-1.3.15-2.1.noarch.rpm"
RPM_HASH = "8947c34845c6f778aca11dedae4d87fba2b63fcd5364cd16ab46dfde245b5da2769f97831d1f90cfe3596a485d2e9f1f37f4dafce201f14ac72beb54089be07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-croniter \
python39-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
