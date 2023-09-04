SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.7"

RPM_NAME = "python311-distlib-0.3.7-1.1.noarch.rpm"
RPM_HASH = "1a82db02bb6d4988fb087d367119a20c88fb4463aa21b90fee003067fedc166775af512028c8f394052fe4a5d23d763d05b8228a5f039e7752c7e1c2615b0e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distlib \
python3.11dist-distlib \
python311-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
