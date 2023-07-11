SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-msk-0.4.0-1.5.noarch.rpm"
RPM_HASH = "715fa8b036525a67877da423f734133160a0cbfa0efdc9d65601221b5290c977e161fbbb80fb7c2773075baff7d7741fa664c9fc9f77aca85949b539f6e84139"
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
