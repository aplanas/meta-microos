SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-msk-0.4.0-1.6.noarch.rpm"
RPM_HASH = "d4869c3bea5d30a5383a524909cecfe8807281aeef427317706444cc2f6815cf1daa8fb5ab8d1991782c313c58dc06be666c690065cb977607dc6d231ff76e09"
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
