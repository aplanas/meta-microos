SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-en_GB-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "c1185455c55ee37099c6fc746e173e648276edb7b1f1f1116c2a7dbbdc98fff591a915bbd1d9225f1d61f47e07ba9db4514a78a876f29f21692c7c2613050625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
