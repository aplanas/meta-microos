SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-wolframalpha-5.0.0-2.5.noarch.rpm"
RPM_HASH = "22956b98e910474715876bbb23799260f35ddc6e010c5b78a10a8c82f3919d91ac1cab501b1bd8642f6036408b3ff5c4144bb784258decd7fecbf26057f0a9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wolframalpha \
python310-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.context \
python310-more-itertools \
python310-xmltodict"

inherit rpm
