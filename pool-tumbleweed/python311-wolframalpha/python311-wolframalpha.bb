SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-wolframalpha-5.0.0-2.5.noarch.rpm"
RPM_HASH = "0b354bf9ee0b774db2de8886fc0fae4140e696eab9b076936c89e20a83ede361c563cc8840bd764249e185623e1b56ebf0452c110457d4d181d2e01260f8a32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wolframalpha \
python3.11dist-wolframalpha \
python311-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.context \
python311-more-itertools \
python311-xmltodict"

inherit rpm
