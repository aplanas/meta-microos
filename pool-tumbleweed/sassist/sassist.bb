SUMMARY = "Dell SupportAssist log collector"
DESCRIPTION = "Dell SupportAssist log collector for Linux."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "sassist-0.8.6-1.8.noarch.rpm"
RPM_HASH = "c5c36418957a8b37f0557d23a219de812b3b9ded336178e9c5cb57030a63c184bc2f7cfbed4be1dd5ba031c93cf9dee65ade5a796e0f3260bf0f96a43c74ff5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sassist"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
supportutils \
zip"

inherit rpm
