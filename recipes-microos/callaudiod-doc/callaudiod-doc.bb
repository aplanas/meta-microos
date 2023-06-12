SUMMARY = "API documentation for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains API documentation for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.7"

RPM_NAME = "callaudiod-doc-0.1.7-1.1.noarch.rpm"
RPM_HASH = "dc57bcc283940becec6df6447d3820d0f5015158398ce81bb2d8d261e9455d8b08736e694870bbd9133ba54dc70b7b89956536aa853dfcfc4faa4c7da0ebf5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "callaudiod-doc"
RDEPENDS:${PN} += ""

inherit rpm
