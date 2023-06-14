SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python311-yarg-0.1.9-2.8.noarch.rpm"
RPM_HASH = "e8040ef52e1935f8ef8b4ca3469b9ce88defc8d6e4162db62c578cbee130304c67836e26b0c7defcf9909716001f35ad39593b3083cea9ab9ff73ac11cec6882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yarg \
python311-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
