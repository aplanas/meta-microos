SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python311-versiontag-1.2.0-2.8.noarch.rpm"
RPM_HASH = "538acd67df28b984dad6f5a5aacb03cc0311d7ca05bb8b7a2b5ba56f65d3d7e335a69f03eab9515966eca0cbec05e07d3697928b27cfe0b6b35b0acf8a15a45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(versiontag) \
python311-versiontag \
python3dist(versiontag)"

RDEPENDS:${PN} += "git-core \
python(abi)"

inherit rpm
