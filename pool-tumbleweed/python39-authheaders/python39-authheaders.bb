SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python39-authheaders-0.14.1-1.6.noarch.rpm"
RPM_HASH = "444eb049eebde44f33d5126421e0d1f4f4b5015d2ca0c4d1eaf1f046403659e74c4ed0a3a324dc6d975d8aef29b64fe6d86390318501327b46eadc6c27d9fb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(authheaders) \
python39-authheaders \
python3dist(authheaders)"

RDEPENDS:${PN} += "python(abi) \
python39-authres \
python39-dkimpy \
python39-dnspython \
python39-publicsuffix2"

inherit rpm
