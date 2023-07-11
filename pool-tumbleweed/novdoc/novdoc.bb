SUMMARY = "DocBook based Schema for older SUSE Documentation"
DESCRIPTION = "NovDoc is a DTD/RELAX NG schema used for older SUSE documentation."
LICENSE = "GPL-3.0-only"

PV = "1.0_2.2.2"

RPM_NAME = "novdoc-1.0_2.2.2-12.1.noarch.rpm"
RPM_HASH = "778e0c814fc29d852c1755c8b7c37a22dcc7822671653b6c361acf3d9e9504da00a1af1ba7ccdec957744ba6363df2fd95d65235cc2822c589a6d91ec0581fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-novdoc \
novdoc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
