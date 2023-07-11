SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-screeninfo-0.8.1-1.5.noarch.rpm"
RPM_HASH = "81444d22865a77ee0f852ecc3a316f9727842ccd72fd96b9b068d8abaeaa53b9696216e49aee3f383888235dc6f1895dbe285dcedefdb2311a260656e0da2287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screeninfo \
python3.11dist-screeninfo \
python311-screeninfo \
python3dist-screeninfo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
