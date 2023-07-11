SUMMARY = "[global] extra for python39-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-global-1.2.4-1.6.noarch.rpm"
RPM_HASH = "f03b9b7a11b28784f5259c1fec91a144ff070158d8dda13b0b8d414029ca276149baab878f54927fe6375671dd9e48dbd433a0965c4b6ed326fff030be9837d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytoolconfig-global"

RDEPENDS:${PN} += "python39-platformdirs \
python39-pytoolconfig"

inherit rpm
