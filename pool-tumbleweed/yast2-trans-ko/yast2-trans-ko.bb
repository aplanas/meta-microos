SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ko-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "cdb4cbb93db6019d9815bf189a04df8031be0f5f29b98c0f059576724a8ddd9807d36c3a45598b8ca8773dc4740d96d77ae470a34ead02cdf883979cf7c9dac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
