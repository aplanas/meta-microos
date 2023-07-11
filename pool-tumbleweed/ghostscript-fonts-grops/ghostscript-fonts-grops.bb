SUMMARY = "Ghostscript fonts imported to groff for use with grops"
DESCRIPTION = "A version of PostScript® driver for Groff to support characters outside ISO Latin 1 character set."
LICENSE = "GPL-2.0-only"

PV = "1.22.2"

RPM_NAME = "ghostscript-fonts-grops-1.22.2-10.9.noarch.rpm"
RPM_HASH = "6429dd6dd40d647d7aa595fe5590397b107521427c187e323e81b0f7c3bc93b6ebdf2c51e048a9cda0e61e52fb7ae187964c19cbe4d9a4316700a23b97eb9aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ghostscript-fonts-grops \
ghostscript-fonts-grops \
locale-groff-pl"

RDEPENDS:${PN} += "groff"

inherit rpm
