SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-icoextract-0.1.4-1.5.noarch.rpm"
RPM_HASH = "f2e05e098ebd8850bfbf2c51b5efc691df1580c7469aaa2eb117dc6f6e7aba06843017fe8bf982240fd47178dba36fc5c8479a29f7cb758022c31184c5f26273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icoextract \
python3.11dist-icoextract \
python311-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pefile \
update-alternatives"

inherit rpm
