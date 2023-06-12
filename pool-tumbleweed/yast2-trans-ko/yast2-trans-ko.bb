SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ko-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "9bbbc8da7648094f1afe47aa87b113685c91eec0c4c1f6354e64da6b52a1de98d070df07cbee5bb60c5b34b4676d87ec448cadf19e454d122eb5508a8d9723df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ko) \
yast2-trans-ko"
RDEPENDS:${PN} += ""

inherit rpm
