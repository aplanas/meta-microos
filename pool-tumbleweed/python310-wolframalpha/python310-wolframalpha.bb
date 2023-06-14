SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-wolframalpha-5.0.0-2.3.noarch.rpm"
RPM_HASH = "576741ae67e85d0306093809fc2cb19b24977f4223ff5ad3358e380165f1893e556cfdbee460acb3e3620e030f80872997cea5b8631f012ea95fb28cd1dc4651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wolframalpha \
python3.10dist-wolframalpha \
python310-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.context \
python310-more-itertools \
python310-xmltodict"

inherit rpm
