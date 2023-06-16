SUMMARY = "Chinese (Unicode) TrueType fonts by Dr"
DESCRIPTION = "Chinese (Unicode) TrueType fonts by Dr. Hann-Tzong Wang"
LICENSE = "GPL-2.0+"

PV = "1.3.0"

RPM_NAME = "wang-fonts-1.3.0-1.17.noarch.rpm"
RPM_HASH = "a25542e22f7b1868b79343875b8891a653166791ed261d8751aee10690d16fc7f7c141d337f59234ab9b49897599822c1dae3f9cf79152c80de36e0aab333537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wang-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
