SUMMARY = "Udev rules to grant access to Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers. \
 \
This sub-package contains udev rules granting access to the \
hardware for regular (non-root) users."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-udev-rules-1.4.3-2.1.noarch.rpm"
RPM_HASH = "9a2faca8aae5f042217cdd073fb9dc93fe6c95504d37e89b1e50afc71d12d69d739dcb2b507739125fd7e30f59117eef7b5c8728431ccfeb1d9cbb1405cb3f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mustang-plug-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
