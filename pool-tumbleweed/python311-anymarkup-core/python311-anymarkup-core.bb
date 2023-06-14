SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-anymarkup-core-0.8.1-3.3.noarch.rpm"
RPM_HASH = "936642a3557538e9c6f219a650fafa1eb48fa742eba1ce53a7b5f27343079a83afd24791e59cb738aefb85b6470428ae66e4da57ff1c031a6cbeeb81c95d295d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-anymarkup-core \
python311-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
