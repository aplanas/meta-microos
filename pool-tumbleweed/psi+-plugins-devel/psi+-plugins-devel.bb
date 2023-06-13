SUMMARY = "Headers for Psi plugins"
DESCRIPTION = "Headers and qmake project include files for developing Psi+ plugins."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-plugins-devel-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "eb8e46581fab80db9bbe5e3b94ed81757fb8597a634c07664872c01bdbc4516b877814edb53e29e21e98ca05cdca3acf300a829512dde3c04ad98c2cf5a5a113"

RPROVIDES:${PN} += "psi+-plugins-devel \
psi+-plugins-devel(aarch-64)"

RDEPENDS:${PN} += "psi+"

inherit rpm
