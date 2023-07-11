SUMMARY = "Legacy usrmove helper files"
DESCRIPTION = "Legacy usrmove helper files for the build system. Do not install."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-legacybin-5.2.15-8.6.noarch.rpm"
RPM_HASH = "d9b8957f96e21de0172919c3b5ee50ce7403c24e3555fdb7095506e07b878ed4dfaa4bb19bce425864eef41d3d1962bf2f1d9b1de791591214c290db64fc2c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-legacybin"

RDEPENDS:${PN} += "bash \
this-is-only-for-build-envs"

inherit rpm
