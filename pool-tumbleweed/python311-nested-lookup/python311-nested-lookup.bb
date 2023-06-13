SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python311-nested-lookup-0.2.25-1.3.noarch.rpm"
RPM_HASH = "7e9be17b1e288178b15aac9f74ff955a5808e4ecb4f35c5713a361892cebb7bdf5a6ed4f6bcfb758d7556985428f418d8fafa3a6d4749ac819aa67f74e838f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nested-lookup) \
python311-nested-lookup \
python3dist(nested-lookup)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
