SUMMARY = "Wu pronunciation input method"
DESCRIPTION = "Wu pronunciation input method. \
URL: http://input.foruto.com/wu/"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wu-1.8.12-1.1.noarch.rpm"
RPM_HASH = "35384d55673f543f4eb117260ed1bfee19af56d630ce9f96ffe3afe89e33b1cd977b86637282d60ed44d0c5710ddccd5f379b8c6b5b1f0368644a050e41c49b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wu \
ibus-table-wu \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
