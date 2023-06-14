SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python311-DataProperty-0.55.1-1.1.noarch.rpm"
RPM_HASH = "58124ab225736834f5d740aca85e9bbb897a8998a9a0630970727d2456e898d1706b102912bedcf311ffa5f0ebf7e889e99d0bbacbb01eaece5f5269d57e3f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dataproperty \
python311-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python311-mbstrdecoder \
python311-typepy"

inherit rpm
