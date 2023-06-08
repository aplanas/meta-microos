SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-locale-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "bcab52f58f02202c7ec8ed2c64721270743b4986baf608a014ed6c54608a3ee27f0afc42bd2b8d4a8c03fe97df42b8bcb0cff4e00bd08f06660e97ac06889f23"

RPROVIDES:${PN} += "gcc7-locale gcc7-locale(aarch-64) locale(gcc7:be) locale(gcc7:ca) locale(gcc7:da) locale(gcc7:de) locale(gcc7:el) locale(gcc7:eo) locale(gcc7:es) locale(gcc7:fi) locale(gcc7:fr) locale(gcc7:hr) locale(gcc7:id) locale(gcc7:ja) locale(gcc7:nl) locale(gcc7:pt_BR) locale(gcc7:ru) locale(gcc7:sr) locale(gcc7:sv) locale(gcc7:tr) locale(gcc7:uk) locale(gcc7:vi) locale(gcc7:zh_CN) locale(gcc7:zh_TW)"
RDEPENDS:${PN} += "gcc7"

inherit rpm
