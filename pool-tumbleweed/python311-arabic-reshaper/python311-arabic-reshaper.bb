SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-arabic-reshaper-3.0.0-1.3.noarch.rpm"
RPM_HASH = "d770924c590d68aa11bf770aec76015f40b9ad0354cec1a7ba091fd9ff2a6395e461cbbbdd4d4c50ab7e18ba1493f35eda99e2f10bdf6a14590b98e00e94ab44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-arabic-reshaper \
python311-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
