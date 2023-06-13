SUMMARY = "YaST2 - Translation Statistics"
DESCRIPTION = "The package contains statistic files (one file per language).  With the \
help of these statistics Yast warns you if you select a language for \
installation which is unsufficiently translated."
LICENSE = "GPL-2.0+"

PV = "2.19.0"

RPM_NAME = "yast2-trans-stats-2.19.0-17.20.noarch.rpm"
RPM_HASH = "c1e4fed4b02b9ed17fdb15cf03b6b452a3a32fa56ec2e7b904a50924d351ca7d38799e8ae08d72e0fd70e6ae033f2c9730727102289ce8a18cfbc0e4f0ef7fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans-stats"

RDEPENDS:${PN} += ""

inherit rpm
