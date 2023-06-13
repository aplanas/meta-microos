SUMMARY = "Spanish (español) Dictionary for Aspell"
DESCRIPTION = "A Spanish (español) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.2"

RPM_NAME = "aspell-es-1.11.2-2.14.aarch64.rpm"
RPM_HASH = "919822c2bfef5f14823e27795271fdb429d485d0d06657ab8f472e08d780e2404266c94a7b8d117246da5114625039ab30b9584ebc46fa57b3668004153aa25d"

RPROVIDES:${PN} += "aspell-es \
aspell-es(aarch-64) \
locale(aspell:es)"

RDEPENDS:${PN} += ""

inherit rpm
