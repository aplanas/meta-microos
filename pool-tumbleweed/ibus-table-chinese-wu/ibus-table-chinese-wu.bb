SUMMARY = "Wu pronunciation input method"
DESCRIPTION = "Wu pronunciation input method. \
URL: http://input.foruto.com/wu/"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wu-1.8.12-1.2.noarch.rpm"
RPM_HASH = "2734834ac32759a352182a7b22e16a2df674a3deebfb8c817c6e722c79db749dc43ecbd51d0f671bc201d1b75adb853fdd6e448ad84fdeeac5a81087684d8ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wu \
ibus-table-wu \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
