SUMMARY = "LDP Manual Pages (Japanese)"
DESCRIPTION = "These are the Japanese man pages of the Linux Documentation Project. \
Note that they are normally older than the English versions.  For \
reference, you should use the English versions."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GFDL-1.1-only & GFDL-1.2-only & GFDL-1.3-only"

PV = "20230815"

RPM_NAME = "man-pages-ja-20230815-1.1.noarch.rpm"
RPM_HASH = "d2552fb56c0618cae055b40a6a3fcfcda3d3a74d7c846b0becf1f48f39ab076afa4b5db4122a782b72b4208fe1b03d4fcdd8aa63fe3994890888704c58a3ce22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-ja \
man-pages-ja"

RDEPENDS:${PN} += ""

inherit rpm
