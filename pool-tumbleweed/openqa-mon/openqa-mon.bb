SUMMARY = "CLI monitoring utility for openQA"
DESCRIPTION = "openqa-mon is a CLI monitoring client for openqa written in plain go."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "openqa-mon-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "ee8ca1850069825c263582d7aec2261df355d3b018a9a62ebec3406dcc44d7ce5b8ab22bb3383fcc832d96ab7c694caeaf102315dfc44e6cc3c824d0dbb2ea60"

RPROVIDES:${PN} += "openqa-mon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
