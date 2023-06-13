SUMMARY = "LDP Manual Pages (Japanese)"
DESCRIPTION = "These are the Japanese man pages of the Linux Documentation Project. \
Note that they are normally older than the English versions.  For \
reference, you should use the English versions."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GFDL-1.1-only & GFDL-1.2-only & GFDL-1.3-only"

PV = "20230115"

RPM_NAME = "man-pages-ja-20230115-1.1.noarch.rpm"
RPM_HASH = "02985c668ef6a7a9b4d48985cf7b82f34c3e59b7e6f6998d86e7f7ee551f59c7af08641bf3e9c6aa2312bf9f0ea1598c878ff1f801a09516e80803f72a61eed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man:ja) \
man-pages-ja"

RDEPENDS:${PN} += ""

inherit rpm
