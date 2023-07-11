SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pep440-0.1.2-1.6.noarch.rpm"
RPM_HASH = "b3c80f9b3ff2cb5cc20c8cc2d52fd2ec98960cd36b7d608941286fd7326f8b1e51f95ae1ca52fb474fc3f6352020a30592d4f6553e44cdb86d9309759edae7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pep440 \
python310-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
