SUMMARY = "Additional golang-github-linuxdeepin-go-x11-client libraries"
DESCRIPTION = "This package contains additional golang-github-linuxdeepin-go-x11-client \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "golang-github-linuxdeepin-go-x11-client-0.6.9-1.9.noarch.rpm"
RPM_HASH = "ac5dff7bc49c6d4d0e6c68a94c0d5631d35e69795b9db1bf274d15f0a626a72b37589a7e74a23ef5893a220d1854c96f0d174aac3bc9ec4fdb8eaa1e9d7f0455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-x11-client"

RDEPENDS:${PN} += "golang-github-linuxdeepin-go-lib"

inherit rpm
