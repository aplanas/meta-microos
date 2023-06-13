SUMMARY = "Deepin-pw-check source"
DESCRIPTION = "This package contains source of deepin-pw-check \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "golang-github-linuxdeepin-deepin-pw-check-5.1.16-1.5.noarch.rpm"
RPM_HASH = "1c63f46f0158573564d75a00fb6dab26eb502e8009542e78069782c95ac1192515d747321850dfc0a7a4754f599953c16eebce9d523e6466224a3b46268566e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-pw-check"

RDEPENDS:${PN} += "golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
