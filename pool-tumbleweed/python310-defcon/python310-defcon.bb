SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python310-defcon-0.10.2-1.3.noarch.rpm"
RPM_HASH = "17af8edee56a1feec9218cb584ce88eddaaa5bb360133ca09e5d1f09f997e6fc30c6947f13e27bcf414328977737467415c6d26eac1aebe32ad340ae3a8c63b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defcon \
python3.10dist-defcon \
python310-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python310-FontTools \
python310-fs"

inherit rpm
