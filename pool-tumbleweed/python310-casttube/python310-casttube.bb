SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-casttube-0.2.1-2.3.noarch.rpm"
RPM_HASH = "6d7efce64c6a3c73c68a027e1a98f37dddd9f07d85ada5771660f9637963115e0d5dc53d357d22c7c7e75f27912130c65cd6232483b68ff1392130da1a9482c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-casttube \
python3.10dist-casttube \
python310-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi"

inherit rpm
