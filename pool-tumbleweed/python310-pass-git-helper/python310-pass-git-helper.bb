SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python310-pass-git-helper-1.2.0-1.6.noarch.rpm"
RPM_HASH = "54a4a0d9ccf7dee8bd4ecc9e71c0f580545dbcdc23cc455f9d1222931a3eb436ea6d04d70a9bcc93db1ca05d47ef50253994714c70bda92ae91e7f27007a95af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pass-git-helper \
python310-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyxdg \
update-alternatives"

inherit rpm
