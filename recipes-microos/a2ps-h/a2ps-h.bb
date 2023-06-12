SUMMARY = "a2ps Support for Korean PostScript Filter (Python Version)"
DESCRIPTION = "a2ps support for Korean PostScript filter (Python version)."
LICENSE = "GPL-2.0-or-later"

PV = "20010113"

RPM_NAME = "a2ps-h-20010113-680.10.noarch.rpm"
RPM_HASH = "6bbd2081bb3661c724867144d2c2251cf1d3ec9cfffdb41ef474fc5c35ae45929af0b65efe09872b421d52280882197b12624d2e65f7c853e4f3056850a0b1f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "a2ps-h"
RDEPENDS:${PN} += "/usr/bin/env \
python"

inherit rpm
