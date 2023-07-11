SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-casttube-0.2.1-2.4.noarch.rpm"
RPM_HASH = "f50e3a599c2f224b722ae558acf0cdd5f83b6c8739c3971da3b68d39f6f2e565f90f0f8605ae9bcf6bf0b51883431ec65efb1835e8e55a3d0877ad1c04a0536c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-casttube \
python310-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi"

inherit rpm
