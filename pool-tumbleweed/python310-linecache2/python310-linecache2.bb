SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python310-linecache2-1.0.0-6.3.noarch.rpm"
RPM_HASH = "22d19b577a1e4a312d5c3abde1441ee07b8c702abd84eac271795548837a99eb5b5f5b8820604806bc85b7eea77b11ec28de208e4b28cb3afee6ab334ca9287c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-linecache2 \
python310-linecache2 \
python3dist-linecache2"

RDEPENDS:${PN} += "python-abi \
python310-pbr"

inherit rpm
