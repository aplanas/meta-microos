SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kinit-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8531da62f9765a71a2443e233312a82591b66ed9ae78137efa39536e9e489514c7a398245b9db70a36f01f027acc36cb8441b2fa5c297cabcff0aec9f8fba4a2"

RPROVIDES:${PN} += "cmake-KF5Init \
kinit-devel"

RDEPENDS:${PN} += "extra-cmake-modules"

inherit rpm
