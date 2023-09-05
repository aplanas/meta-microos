SUMMARY = "openSUSE Tumbleweed branding for Plymouth bootsplash"
DESCRIPTION = "openSUSE Tumbleweed branding for the plymouth bootsplash"
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "plymouth-branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "9ec3a869e8c4d616c7e8fa537bcd110cb62752612b6750bd9dc24b0065b7928c6b8983a00a51868bf2a0c1f15efa3510e9a0a795418f5cc58852413c43df6754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-openSUSE"

RDEPENDS:${PN} += "plymouth-scripts \
plymouth-theme-bgrt"

inherit rpm
