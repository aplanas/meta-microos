SUMMARY = "Python bindings for stp"
DESCRIPTION = "Python bindings for stp library."
LICENSE = "MIT"

PV = "2.3.3+20220915"

RPM_NAME = "python3-stp-2.3.3+20220915-1.4.noarch.rpm"
RPM_HASH = "0313c60a9a2065ff8747776f7233acf08605d32c1fd42bc706873fbeb8e76aea3bb2800be97caae7467926adf2d7f5e41e2a02b28a110b0d5c81095259223793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stp"

RDEPENDS:${PN} += "libstp2-3 \
python-abi"

inherit rpm
