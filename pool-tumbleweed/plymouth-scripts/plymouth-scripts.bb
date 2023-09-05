SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "a3e0abb9f4b37cc3ab1cdf34995980c1445fea981b5f98f65852bd4e10d987eb584cad6890579ce2146256c76af43b74a5deb9d42343644f1a4896e708a8e45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
dracut \
grep \
plymouth \
sed"

inherit rpm
