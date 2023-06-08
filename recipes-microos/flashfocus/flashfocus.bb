SUMMARY = "Focus animations for tiling window managers"
DESCRIPTION = "Focus animations for tiling window managers. Compatible with all X based window managers."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "flashfocus-2.3.1-1.2.noarch.rpm"
RPM_HASH = "b992e3f25dec8431d0c04ef5c724bc88ff4870506c442cc1a6aa775b4e5a8b39bf29e50b17def7fe2571053bedd40dcc2248fc575b0eaa9e22719b3436ce6b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flashfocus python3.10dist(flashfocus) python3dist(flashfocus)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 python(abi) python3-PyYAML python3-cffi python3-click python3-marshmallow python3-xcffib python3-xpybutil"

inherit rpm
