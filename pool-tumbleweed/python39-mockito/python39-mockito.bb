SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-mockito-1.4.0-1.5.noarch.rpm"
RPM_HASH = "6376978e013143c8f7f44362156189ee54cd94341f85c73f816a1de5d04723cafb0b747ce36ff94057ab7fd339eba75e8d41254450a1c241ef7e50257998d3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mockito \
python39-mockito \
python3dist-mockito"

RDEPENDS:${PN} += "python-abi"

inherit rpm
