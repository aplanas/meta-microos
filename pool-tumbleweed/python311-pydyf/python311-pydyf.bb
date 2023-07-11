SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-pydyf-0.6.0-1.3.noarch.rpm"
RPM_HASH = "0c15d9c98c3913f3b36373e579d0689d6acb9304c653587adb8ba0842f7404a2a0168babc83fc327e2f7d6696c2c25fe18945efe45db00e9c081ebf1ea923fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydyf \
python3.11dist-pydyf \
python311-pydyf \
python3dist-pydyf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
