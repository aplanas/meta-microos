SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python311-flufl.bounce-4.0-4.3.noarch.rpm"
RPM_HASH = "819dcb9e361ee08fd1effa3b6bbde5a6d8ece0559aaf4c32ad2d48dd314d1fb9c65450ba02fa652e719ed793f62cf6d24ce48d195050ef6f214014151e572159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.bounce \
python3.11dist-flufl.bounce \
python311-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python311-atpublic \
python311-zope.interface"

inherit rpm
