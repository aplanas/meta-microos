SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python39-netutils-1.4.1-1.3.noarch.rpm"
RPM_HASH = "4d693505cf9a83feed788b14f8a1c9c497b55cc50ea449619006a36b64ed20366bdbee87bfb07b5ea9980794ee006e0836c63a7e7887a253a9ce6ee89d7ed6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netutils \
python39-netutils \
python3dist-netutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
