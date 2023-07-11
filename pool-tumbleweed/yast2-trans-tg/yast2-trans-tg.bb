SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-tg-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "af634e421704103ff0c81a092e5b884e655fa8d033413cb085bf42e0aaee5f5a0aeaee9b286c9015591a5f56342f5377af4415a7fee0dfd42ce67242bd740dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
