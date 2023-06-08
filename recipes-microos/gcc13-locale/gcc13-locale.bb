SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-locale-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "da2363e12dd7b5fbefb721a029cc2830bb62913a5971d23fb063e25f4ad6220d83fbc063a4dc08f145637da8121adeca54bb6936843ea59611b836f1fa0651a1"

RPROVIDES:${PN} += "gcc13-locale gcc13-locale(aarch-64) locale(gcc13:be) locale(gcc13:ca) locale(gcc13:da) locale(gcc13:de) locale(gcc13:el) locale(gcc13:eo) locale(gcc13:es) locale(gcc13:fi) locale(gcc13:fr) locale(gcc13:hr) locale(gcc13:id) locale(gcc13:ja) locale(gcc13:ka) locale(gcc13:nl) locale(gcc13:pt_BR) locale(gcc13:ro) locale(gcc13:ru) locale(gcc13:sr) locale(gcc13:sv) locale(gcc13:tr) locale(gcc13:uk) locale(gcc13:vi) locale(gcc13:zh_CN) locale(gcc13:zh_TW)"
RDEPENDS:${PN} += "gcc13"

inherit rpm
