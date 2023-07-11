SUMMARY = "Apparmor bash Abstraction for Lmod"
DESCRIPTION = "Profile for shell source scripts for lua-lmod"
LICENSE = "MIT"

PV = "8.7.17"

RPM_NAME = "lua-lmod-apparmor-abstractions-8.7.17-3.1.noarch.rpm"
RPM_HASH = "421ed1758e1896a26f34ee215ff1549a9629de012c8bdcb7ee374fe13dfb2677cb3a500c607f4042d1c9fe58a94918901f25a2de344104530dc38c5aa0ba6e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lmod-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions"

inherit rpm
