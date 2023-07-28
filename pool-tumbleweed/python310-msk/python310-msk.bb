SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-msk-0.4.0-1.6.noarch.rpm"
RPM_HASH = "d51ea379052486d0822b69a19513b262c6a55ab978e28340e8a44662873d5e21ba53d3f9e6efd683a5e305e5d3c84821f1d4e09cfac4e8c1f8d5aedf64f3f1f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msk \
python310-msk \
python3dist-msk"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-GitPython \
python310-PyGithub \
python310-msm \
update-alternatives"

inherit rpm
