SUMMARY = "Chinese Lunar calendar library Documents"
DESCRIPTION = "Documents for Chinese Lunar calendar library"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-doc-2.9.3-2.14.noarch.rpm"
RPM_HASH = "84e75a972f4bdb025c75f4f2b8ac0e320e10bdac02762d2419bdb3b4537c4c80d46cf9767b88dbb475c0ddc3da0dab80ad377b4415e62f3d84e414fdf704e8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lunar-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
