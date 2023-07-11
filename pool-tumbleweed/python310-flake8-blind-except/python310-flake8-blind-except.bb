SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-flake8-blind-except-0.2.1-1.4.noarch.rpm"
RPM_HASH = "3eef10b5404829b0b7f76b0f31b5a4bc6447ccc305aee26b8a884e673d986b2f8a13097ce46ae4645c81dbf41e13c29c1542bf376494aa596bd839a81e4832ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-blind-except \
python310-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
