SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python310-dotmap-1.3.30-1.3.noarch.rpm"
RPM_HASH = "c55b6b4a73bbc4a62bfb9ab89921b26595490f682bf423d530c2a61433b93b8f337f4e2cef0e49f7d3a76e24d793526a58fdda5525d23ea55cd0a4791ddbbaae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dotmap \
python3.10dist(dotmap) \
python310-dotmap \
python3dist(dotmap)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
