SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python39-contextvars-2.4-4.3.noarch.rpm"
RPM_HASH = "61e98533d773cdfc2839724b53030bb326def838980ec46cab4dba2193911c90b32445cbd3e2c078142a9af29a61de60c30ab40372894b748063f5ccce21ec00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-contextvars \
python39-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python39-immutables"

inherit rpm
