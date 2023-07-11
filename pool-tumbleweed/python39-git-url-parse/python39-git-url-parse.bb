SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-git-url-parse-1.2.2-1.16.noarch.rpm"
RPM_HASH = "8fe602361578688b90447e3ac02d1911cc4e368eddbad861e1099415de91eb9ff49845dcfd9e20fdfafcf0994b22be908c6890e79421906bf6607fd1d0db093b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-git-url-parse \
python39-git-url-parse \
python3dist-git-url-parse"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
