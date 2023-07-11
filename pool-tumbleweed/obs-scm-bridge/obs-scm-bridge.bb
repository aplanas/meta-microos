SUMMARY = "A help service to work with git repositories in OBS"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "obs-scm-bridge-0.4.2-1.1.noarch.rpm"
RPM_HASH = "07407604056b3186d64be0a31c375948243e098c24ed222a42af75846bbc5820476a6a2d814ce381bc783bbf74585951563f0780fafeca164c6be5bdf4c97d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-scm-bridge"

RDEPENDS:${PN} += "/usr/bin/python3 \
build \
perl-Date--Parse \
perl-LWP--UserAgent \
perl-Net--SSL \
perl-Pod--Usage \
perl-Time--Zone \
perl-URI \
perl-XML--Parser \
perl-YAML--LibYAML"

inherit rpm
