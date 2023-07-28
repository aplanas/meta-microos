SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python310-specfile-0.20.0-1.1.noarch.rpm"
RPM_HASH = "987c14976afc551b22ff3e15270c993baa2e0dee370c9632de7d5d82cd95cc9f0d9fb4ebcc0a438d23b75ec57b35c10fdcf819af60979a3d57473a2457988c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-specfile \
python310-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python310-rpm"

inherit rpm
