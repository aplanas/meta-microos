SUMMARY = "JSON CLI output utility"
DESCRIPTION = "jc is used to JSONify the output of many standard linux cli tools \
and file types for easier parsing in scripts."
LICENSE = "MIT"

PV = "1.22.4"

RPM_NAME = "jc-1.22.4-1.3.noarch.rpm"
RPM_HASH = "9a8df8747b75cb18efb04cf4d819493da2460d31dfb2e35b67dfe6f22b0687ddb408b41b031c02eb1313a4ace8651aac761b9960e82531ecc9fa3f6079cca6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jc \
python3.10dist-jc \
python3dist-jc"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-ifconfig-parser \
python3-ruamel.yaml \
python3-xmltodict"

inherit rpm
