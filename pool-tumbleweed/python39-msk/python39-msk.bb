SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-msk-0.4.0-1.4.noarch.rpm"
RPM_HASH = "8fa0f6c6ff7625d7a704ae1724ea04a4c5bdb809e588cfbbf15ef87082759a4da9e2f2217703b727fa8fb913c00a1704500eadf624dfbcd11d506db8600f637a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msk) \
python39-msk \
python3dist(msk)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-GitPython \
python39-PyGithub \
python39-msm \
update-alternatives"

inherit rpm
