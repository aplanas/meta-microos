SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-crashtest-0.4.1-2.1.noarch.rpm"
RPM_HASH = "1d4d3930e04506cc528e6b0e596214d10b0c92fbfdde3ab74f055ae950c3d387da92d3472e59664e42b7385946a3b292dbe019f0dca25dc310e98511e875d39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crashtest \
python3.10dist-crashtest \
python310-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
