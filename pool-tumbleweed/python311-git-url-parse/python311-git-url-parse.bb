SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-git-url-parse-1.2.2-1.16.noarch.rpm"
RPM_HASH = "f759f5c070fb5463782f4748aea9f42dae5378b5319f61410ce57d71fe39ed0dfc3fcb079262edcfb77a37cba74011309e212b1f2de72912fcdc4fb37d6004ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-git-url-parse \
python3.11dist-git-url-parse \
python311-git-url-parse \
python3dist-git-url-parse"

RDEPENDS:${PN} += "python-abi \
python311-pbr"

inherit rpm
