SUMMARY = "Data manipulation for end-users"
DESCRIPTION = "Adminer Editor is both easy-to-use and user-friendly database data editing tool \
written in PHP. It is suitable for common users, as it provides high-level data \
manipulation."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-editor-4.8.1-1.6.noarch.rpm"
RPM_HASH = "878982bea306184152cb481ea08d5326b272417f0e1de85e56e82a2da05b7724543534a0cd16f627da3e38c96eccc8c1463d1e980d22c450463dbf3046a39317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-editor"
RDEPENDS:${PN} += "adminer"

inherit rpm
