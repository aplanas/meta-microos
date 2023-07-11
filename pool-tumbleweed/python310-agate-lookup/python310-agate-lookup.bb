SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-agate-lookup-0.3.2-1.1.noarch.rpm"
RPM_HASH = "18592a8650a090f0dad57688defbe38b127a008797a0933089e2aa7116ca2d09924406d566a066b5205bcf83189eeec1866f0856d51444859a1be3653a963363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-lookup \
python310-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-agate \
python310-requests"

inherit rpm
