SUMMARY = "EFL user interface for connman"
DESCRIPTION = "EFL user interface for connman (Connection Manager)."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "econnman-1.1-2.3.noarch.rpm"
RPM_HASH = "c20304339c8189cb9e29b5ac3e777702f6176e484de45c04e7c4b686b0855d0843ad02ab5d5d93e132812f6feb27aaa89987f308e215ab65d8498bf8f3e65d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(econnman-agent.desktop) \
application(econnman.desktop) \
econnman"
RDEPENDS:${PN} += "/usr/bin/python3 \
connman \
python3 \
python3-efl"

inherit rpm
