SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.0"

RPM_NAME = "python39-referencing-0.30.0-1.1.noarch.rpm"
RPM_HASH = "c55b0575f26dad4284cfae4592533370d37a65799a96e6cef9f7000e2af8accdf3396c0432ce3c7f91d080ffde06546e77b170faf97f8584235526fef0d5f1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-referencing \
python39-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-rpds-py"

inherit rpm
