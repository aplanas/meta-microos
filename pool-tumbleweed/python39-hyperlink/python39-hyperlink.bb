SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python39-hyperlink-21.0.0-2.3.noarch.rpm"
RPM_HASH = "bac546471d57322b3f3d4e3449c89c8b22f9fe37323fe8e5a1f216328a87026f00a589bd61920044c8281b8334d10e7092cbfba75dea1fc96ad02f31b896e699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hyperlink \
python39-hyperlink \
python3dist-hyperlink"

RDEPENDS:${PN} += "python-abi \
python39-idna"

inherit rpm
