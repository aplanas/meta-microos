SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "keylime-tenant-7.5.0-1.1.noarch.rpm"
RPM_HASH = "8efac9d71ef970700ac46e343aa18c6f60c98d2d61b3f4c1fa103a4808012f992a4f01600722667dc430dfb5ceba7cf195b226f5d720892b16c6c20c0ab995f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "keylime-config \
keylime-tpm-cert-store \
python3-keylime"

inherit rpm
