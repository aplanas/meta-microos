SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-bg-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "a277d473062c39b52328b05919fe5803238ae829c0c3c28a88e96641c6d6f8d1f8b39dcff126ee2523dbdb0758a81ea6ccd764488af2f7bd6cec443388cb7f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm
