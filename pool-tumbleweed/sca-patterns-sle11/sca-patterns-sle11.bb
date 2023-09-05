SUMMARY = "Supportconfig Analysis Patterns for SLE11"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE11 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.3"

RPM_NAME = "sca-patterns-sle11-1.5.3-1.1.noarch.rpm"
RPM_HASH = "fd1f1f06114ca805edb58fe3ddb26074efbacaa9f5b863874bea13d6f42a142ca179b16ab5aa22e7e477f4e76f6c3a30b0ed8a178e464f770da2bd6a3ac53381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle11"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
