SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python39-ptr-20.2.26-3.12.noarch.rpm"
RPM_HASH = "6192c4ec91cd971c0fecce27409e0a0c73c01017d4dc76b05eadd4b6867cc635482674cbdbfaecbe948f72a8c56e1b49a0ace6394253637d817ada6c79e7f5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ptr) \
python39-ptr \
python3dist(ptr)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
