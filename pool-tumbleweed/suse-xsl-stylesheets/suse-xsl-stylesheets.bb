SUMMARY = "SUSE-Branded Stylesheets for DocBook"
DESCRIPTION = "These are SUSE-branded XSLT 1.0 stylesheets for DocBook 4 and 5 that are be used \
to create the HTML, PDF, and EPUB versions of SUSE documentation. These \
stylesheets are based on the original DocBook XSLT 1.0 stylesheets."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.92.0"

RPM_NAME = "suse-xsl-stylesheets-2.92.0-1.1.noarch.rpm"
RPM_HASH = "cb4154de03af6c34a3089ab7a510e224247e5c79c73cd607fbee65766c4efdfdd71e4aeca502cf0d12110341e4ac1cc6c52a540c7d1992d3303ab8ce2cfeb62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-suse-xsl-stylesheets \
suse-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh \
arabic-amiri-fonts \
dejavu-fonts \
docbook-4 \
docbook-5 \
docbook-xsl-stylesheets \
docbook5-xsl-stylesheets \
ghostscript-fonts-std \
gnu-free-fonts \
google-noto-sans-jp-bold-fonts \
google-noto-sans-jp-regular-fonts \
google-noto-sans-kr-bold-fonts \
google-noto-sans-kr-regular-fonts \
google-noto-sans-sc-bold-fonts \
google-noto-sans-sc-regular-fonts \
google-noto-sans-tc-bold-fonts \
google-noto-sans-tc-regular-fonts \
google-opensans-fonts \
google-poppins-fonts \
libxslt-tools \
sgml-skel \
sil-charis-fonts"

inherit rpm
