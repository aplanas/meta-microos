SUMMARY = "Source Han Serif TW"
DESCRIPTION = "Source Han Serif is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License, Version 1.1."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "adobe-sourcehanserif-tw-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "f8a4bb51c9b75d6ae567baa571e84a4c5650a100ba35fbb2c878c42e07b2666db8396fbaef3b59e040e3c7687f397b5a2c3984370801f7e715b4c18bed5d7213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-fonts adobe-sourcehanserif-tw-fonts locale(zh_TW) scalable-font-zh_TW"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
