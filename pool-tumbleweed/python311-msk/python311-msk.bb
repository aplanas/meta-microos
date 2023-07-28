SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-msk-0.4.0-1.6.noarch.rpm"
RPM_HASH = "d427cedd776b030024eca21d08754c5d330b67b3f4b452c101bf7077d8db1bfaa2422c5ba5c727b421999195d4a7b8c720ee9cfdb22072c09dfa0a63579ef692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msk \
python3.11dist-msk \
python311-msk \
python3dist-msk"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-GitPython \
python311-PyGithub \
python311-msm \
update-alternatives"

inherit rpm
