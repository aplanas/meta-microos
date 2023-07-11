SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python311-defcon-0.10.2-1.5.noarch.rpm"
RPM_HASH = "cdbc12adcc7e161021415dddb81e73f0697ca701fa49978ae87d39033cb2bf7a0014e7ad273ae9bd3b9788d7b0f7585f31732d45b6757cb685f63148471b75c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defcon \
python3.11dist-defcon \
python311-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-fs"

inherit rpm
