SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pipx-1.2.0-2.1.noarch.rpm"
RPM_HASH = "773e8e554120ac6d04338cf056e8657a6d0249fe7505f1e53e5da37dae8068c594b297a5e306e0d1b0807daf96da3740ab9c463d48ab9500c258802785a0d287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pipx \
python310-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-argcomplete \
python310-packaging \
python310-userpath"

inherit rpm
