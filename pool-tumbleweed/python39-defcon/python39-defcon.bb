SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python39-defcon-0.10.2-1.5.noarch.rpm"
RPM_HASH = "ad756680d927d8ca20948c36d080410af6943de1095466bf3ceec6b602fd74d61a056af1264e197097e549b3a357d1470f8b184da5a3b4268dba0085b72bd8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-defcon \
python39-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python39-FontTools \
python39-fs"

inherit rpm
