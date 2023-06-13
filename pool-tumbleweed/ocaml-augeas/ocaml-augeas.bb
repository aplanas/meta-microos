SUMMARY = "OCaml bindings for Augeas configuration API"
DESCRIPTION = "Augeas is a unified system for editing arbitrary configuration \
files. This provides complete OCaml bindings for Augeas."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "ocaml-augeas-0.6-1.3.aarch64.rpm"
RPM_HASH = "33768545a597cf5268411248cda1b1328ecc215634f9947c53626766f2483e8a1dc57c58ef869cc52f971bee825ca33e80918fbd128c2b3ff2d00ffac16a0b1c"

RPROVIDES:${PN} += "ocaml-augeas \
ocaml-augeas(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaugeas.so.0()(64bit) \
libaugeas.so.0(AUGEAS_0.1.0)(64bit) \
libaugeas.so.0(AUGEAS_0.10.0)(64bit) \
libaugeas.so.0(AUGEAS_0.11.0)(64bit) \
libaugeas.so.0(AUGEAS_0.16.0)(64bit) \
libaugeas.so.0(AUGEAS_0.22.0)(64bit) \
libaugeas.so.0(AUGEAS_0.8.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
