SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-wolframalpha-5.0.0-2.3.noarch.rpm"
RPM_HASH = "bb1b9c8c4a7b79b0549003be06b8eedc66d927116c57274dd4340c62e620a821793caee593823cb770d9a2425e3da3a2f2bd09d0057ae58ce6431686e3256695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wolframalpha \
python39-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.context \
python39-more-itertools \
python39-xmltodict"

inherit rpm
