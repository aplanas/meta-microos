SUMMARY = "Helper Scripts for the SGML System"
DESCRIPTION = "These scripts will help prepare and maintain parts of an SGML system."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "sgml-skel-0.7.2-1.5.noarch.rpm"
RPM_HASH = "ea1611557258b3fa79f180dece2d9e649ed0b7783657e527bfa4ce2f01b6fa8acc01d3d28d50c2e7128f396e6ce1df1fd32c01a8547df54aa905c1498c890836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sgml-skel) \
sgml-skel"

RDEPENDS:${PN} += "/bin/awk \
/bin/bash \
/bin/sh \
bash \
coreutils \
findutils \
libxml2-tools \
libxslt-tools \
sed"

inherit rpm
