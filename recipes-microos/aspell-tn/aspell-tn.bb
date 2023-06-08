SUMMARY = "Setswana Dictionary for Aspell"
DESCRIPTION = "A Setswana dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "aspell-tn-1.0.1-2.14.aarch64.rpm"
RPM_HASH = "35cc6e5d426178993272b9caceb53c8382feaf779370449155e5e9d61f8c959b0c559c3add477e1ab121e1cf4d8fcafbc1dfa11b881c441375a68522cf31f63a"

RPROVIDES:${PN} += "aspell-tn aspell-tn(aarch-64) locale(aspell:tn)"
RDEPENDS:${PN} += ""

inherit rpm
