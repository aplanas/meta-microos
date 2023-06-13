SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pep440-0.1.2-1.4.noarch.rpm"
RPM_HASH = "b8bc4e650cd4c38c2e79925e25689bcd982528b69720bbce5c75de1300defeba7dc20b5b24c54ec388099c80825d6b227c26dce01f0f4e7ab1f890162b852465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep440 \
python3.10dist(pep440) \
python310-pep440 \
python3dist(pep440)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
