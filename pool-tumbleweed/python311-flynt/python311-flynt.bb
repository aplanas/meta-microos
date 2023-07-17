SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.78"

RPM_NAME = "python311-flynt-0.78-1.1.noarch.rpm"
RPM_HASH = "24599c5de5d3fd2c24fff4b0489ad441b1afa1b1b3fad6a6e0f6cbdb47bf1fd3ba7b86449bc8bef99890f2b80e8f464478ee5ac5a7b558be28c55a11b88e0f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flynt \
python3.11dist-flynt \
python311-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-astor \
python311-tomli"

inherit rpm
