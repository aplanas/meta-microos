SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python39-versiontag-1.2.0-2.9.noarch.rpm"
RPM_HASH = "6e2fb9489d49fc3f2f6d19349a3569495f216797639c54087c8f4cc0d0fef2ba7b8f050294ec31b9044f787ba3a190ac34aa50817e8df884d278aa3364f3c707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versiontag \
python39-versiontag \
python3dist-versiontag"

RDEPENDS:${PN} += "git-core \
python-abi"

inherit rpm
