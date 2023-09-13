SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-en_GB-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "b56f509053f047cd7d973c02cd7346c694fa03e76b54e554c82916579bc467db9ef0f53ccc86b962f0dfd7826b2503b4ae1645ceb02485786dbb52da81b0bf20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
