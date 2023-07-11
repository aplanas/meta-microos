SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python311-visitor-0.1.3-1.20.noarch.rpm"
RPM_HASH = "aa46d6305daea40c8e26a23e8e822c08ea64aa76eb6d1d5b2b2898cd3ecc482406f210a039b619db42aa87b051291bba7f7841a9f4806d9728a57ee933dab66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visitor \
python3.11dist-visitor \
python311-visitor \
python3dist-visitor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
