SUMMARY = "Sans serif, Unicode-compliant Font For Literacy Use"
DESCRIPTION = "Andika is a sans serif, Unicode-compliant font designed \
especially for literacy use, taking into account the needs of \
beginning readers. The focus is on clear, easy-to-perceive \
letterforms that will not be readily confused with one another. \
 \
A sans serif font is preferred by some literacy personnel for \
teaching people to read. Its forms are simpler and less cluttered \
than those of most serif fonts."
LICENSE = "OFL-1.1"

PV = "6.200"

RPM_NAME = "sil-andika-fonts-6.200-1.1.noarch.rpm"
RPM_HASH = "057d8eb56bafbbe19ee8413d43d0d049ed1469c5ca09498d74356e10e7e867796c20b8052e54a109df10261075152ef84636d64a00d4578c7cd7f373c2368a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-andika-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
