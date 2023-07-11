SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-wolframalpha-5.0.0-2.5.noarch.rpm"
RPM_HASH = "378e2ca2a2ebc24191216743adbc6c62ddafd8ce0ef0955e383c3928f3ca4869f89683720328c33f1f639f23ab433051658e8723aebe998a086e345c3e6e2ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wolframalpha \
python39-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.context \
python39-more-itertools \
python39-xmltodict"

inherit rpm
