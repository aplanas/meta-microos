SUMMARY = "quick input schema for rime"
DESCRIPTION = "quick input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-quick-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "bd94e97b9bbf46db629c77641ba6d43f9666adf396081ad649eceb3e49124b5fab3c08dbe4661fe743b4bff23d46552f671eab6acf26c370dfa9cd3172357122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-quick"
RDEPENDS:${PN} += ""

inherit rpm
