SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-msk-0.4.0-1.5.noarch.rpm"
RPM_HASH = "98c64095a592eae28176100e69f4c9282db15caef7ebee6847450ec7799e9ae5157105d0984a8ebe0c8cbf9caceca20f3561d6851d9f75edab2b76cdfb9eea8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msk \
python39-msk \
python3dist-msk"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-GitPython \
python39-PyGithub \
python39-msm \
update-alternatives"

inherit rpm
