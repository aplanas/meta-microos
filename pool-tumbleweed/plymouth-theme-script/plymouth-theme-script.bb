SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "d8eaa8fe00426ff92a1440cd370c4ceeb3f8ce7439d368ec51455471acd2e9b57e20fdd1d4fa181eb880b6489b4b32495ac2fba7e99e2e456b93364409329771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"

RDEPENDS:${PN} += "plymouth-plugin-script \
plymouth-scripts"

inherit rpm
