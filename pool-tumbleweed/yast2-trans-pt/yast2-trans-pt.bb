SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-pt-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "124ae8e6f0d5071a15f28f8ba20d473dea73491dd4603769a1f3cdae47c273753b88db4c5a7d51b25d3c1c4622ce31ef6c921e90c5eac6a2942bd15078919fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
