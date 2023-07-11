SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-anymarkup-core-0.8.1-3.5.noarch.rpm"
RPM_HASH = "017e87d5b11b0118e49caa8eda5ff6a52eb6cfceeb6edbddd58777a5c34f21f3232825c9a679a7bbc661fbe2acc211766900808c0ef93f5104894d3e956c17fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anymarkup-core \
python3.11dist-anymarkup-core \
python311-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
