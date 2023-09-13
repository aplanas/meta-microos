SUMMARY = "A ligatured font for the Old Hungarian script"
DESCRIPTION = "Kende is a ligatured font for the Old Hungarian script."
LICENSE = "OFL-1.1"

PV = "20230908"

RPM_NAME = "rovasiras-kende-fonts-20230908-1.1.noarch.rpm"
RPM_HASH = "1f0f10e270bd684562bb62c3861e97d98071f5a4b15bc94263e2527dfd57dee20a0530dc75fbeebee32fa8532f2eed09c38fbb7d83bccbd54825e98c0815a822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rovasiras-kende-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
