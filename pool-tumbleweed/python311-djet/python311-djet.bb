SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-djet-0.3.0-2.5.noarch.rpm"
RPM_HASH = "1bd678ab00324d6768e0db08a17702c6b6649fc91d2d89746add281d73967ee130dc0994f2dcc2e0efa9aeb1adf46595e5b5662d92fc4e0b0f695a29be28c28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djet \
python3.11dist-djet \
python311-djet \
python3dist-djet"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Pillow \
python311-six"

inherit rpm
