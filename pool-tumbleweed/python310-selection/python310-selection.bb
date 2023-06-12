SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.14"

RPM_NAME = "python310-selection-0.0.14-1.16.noarch.rpm"
RPM_HASH = "143955e84c0fbba2489b510fbbb1267cf11f369968de82a6e143c2099096eb8f835f33caffc6149e648e4d8a19def5b179c52f7210fd1295b269cbebe89da784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-selection \
python3.10dist(selection) \
python310-selection \
python3dist(selection)"
RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-six \
python310-weblib"

inherit rpm
