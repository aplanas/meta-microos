SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python39-authheaders-0.14.1-2.3.noarch.rpm"
RPM_HASH = "af7e007a04c6a78c5c540bbc883e1380d5914c62e825ab11b085783c790e1b2f62e2109dd39d0ab3dd50b263ae54b52ee65fe9b0ac8d3e922cf2b76d1ac0a4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-authheaders \
python39-authheaders \
python3dist-authheaders"

RDEPENDS:${PN} += "python-abi \
python39-authres \
python39-dkimpy \
python39-dnspython \
python39-publicsuffix2"

inherit rpm
