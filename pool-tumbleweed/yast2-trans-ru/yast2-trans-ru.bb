SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ru-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "de7155d5808094871890fca1a963359bbc10e7a23c141a099ad9e148685f5967c4957f9bbda7fdfd6287d710f45dbe1cbf228f5db96d6d9c9917b28733d814e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm
