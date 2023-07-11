SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python39-derpconf-0.8.3-2.3.noarch.rpm"
RPM_HASH = "b43c48a349766f5c0ae7572b39d44dcfdd18c4da1bb51f00297a65db346d676dd59d017def95b481431105448bf8a243aa540f70f43d7214de5a73d629bf4c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-derpconf \
python39-derpconf \
python3dist-derpconf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
