SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-click-aliases-1.0.1-3.14.noarch.rpm"
RPM_HASH = "d795bbe749f1c865af4e6abe76f0cec85d7a65da6bd8292de4d81ac91da3681ad53e37bf1180d5cc97c9e3abefc116a9506337731483e66fefc905073b2ad69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-aliases \
python310-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
