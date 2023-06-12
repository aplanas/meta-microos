SUMMARY = "Legacy usrmove helper files"
DESCRIPTION = "Legacy usrmove helper files for the build system. Do not install."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-legacybin-5.2.15-8.3.noarch.rpm"
RPM_HASH = "c30b407f4039750be436ba19e22287c587905ce4b1072038a3647df11690452d3af1b358c85f50b575354bde467de14396952c4555978564fb2f3b3e66df55f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-legacybin"
RDEPENDS:${PN} += "bash \
this-is-only-for-build-envs"

inherit rpm
