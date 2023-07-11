SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "keylime-firewalld-7.2.5-1.3.noarch.rpm"
RPM_HASH = "f3d72501cb275f89482f9f40d9f3e275e66e758d69ad89f4869f77f1b26e0b93c0d79f264efa9331fa0626a378ce4f47988a8811836e257bdaf863b12f7ff055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime"

inherit rpm
