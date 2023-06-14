SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python311-defcon-0.10.2-1.3.noarch.rpm"
RPM_HASH = "4cb55bf5b97e9afb3af78b62722ed2b1dcbaa908fe4394ed647d3f59fecb5fc7e91d27348620600009dd1043a8764bb4142959ed05bec2ca5d97a4cf51fbb0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-defcon \
python311-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python311-FontTools \
python311-fs"

inherit rpm
