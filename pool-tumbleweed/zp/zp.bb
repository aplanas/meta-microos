SUMMARY = "Shorter command of zypper"
DESCRIPTION = "A set of alias definitions (actually implemented using sh functions) \
for zypper: \
 \
- zp: sudo zypper \
- zi: sudo zypper install \
- zr: sudo zypper remove \
- zu: sudo zypper update (Leap) or sudo zypper dup (Tumbleweed) \
- zs: sudo zypper search \
 \
Have a lot of fun..."
LICENSE = "GPL-3.0"

PV = "0.2.0"

RPM_NAME = "zp-0.2.0-1.10.noarch.rpm"
RPM_HASH = "8f7658d44cc0243b8ef99dfbd687f1c2ee0c7dac3a60c82304dee79256c06674232fdda840de8cb773e4511e0fdf634a2c5c6708215d8e9818bcb1e561329c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zp"
RDEPENDS:${PN} += "zypper"

inherit rpm
