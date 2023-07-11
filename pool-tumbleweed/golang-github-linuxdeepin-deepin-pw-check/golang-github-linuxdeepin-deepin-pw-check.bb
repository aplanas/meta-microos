SUMMARY = "Deepin-pw-check source"
DESCRIPTION = "This package contains source of deepin-pw-check \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "golang-github-linuxdeepin-deepin-pw-check-5.1.16-1.6.noarch.rpm"
RPM_HASH = "2e68117ef3289115be3de9c75bcad007ba53c0bad2d8ba8efb6d10b5c52054c56f18a5e6f6e82a961b4658e866b083c42ccbd6d33df82023bdbdda4a4ee64453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-pw-check"

RDEPENDS:${PN} += "golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
