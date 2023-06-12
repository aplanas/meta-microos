SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-1.1.aarch64.rpm"
RPM_HASH = "2c36e40ddb9838793ed1d5709d1753e1a8e29b5bdb12aab80a29964a1a8548bce9a2e526bb65f41b00209cdbccb0b26250f97c641a946aa70ce289283480f6ae"

RPROVIDES:${PN} += "google-or-tools-minizinc \
google-or-tools-minizinc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libabsl_flags_internal.so.2301.0.0()(64bit) \
libabsl_flags_marshalling.so.2301.0.0()(64bit) \
libabsl_flags_parse.so.2301.0.0()(64bit) \
libabsl_flags_reflection.so.2301.0.0()(64bit) \
libabsl_flags_usage.so.2301.0.0()(64bit) \
libabsl_log_initialize.so.2301.0.0()(64bit) \
libabsl_log_internal_message.so.2301.0.0()(64bit) \
libabsl_log_internal_nullguard.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_time.so.2301.0.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libortools.so.9()(64bit) \
libortools_flatzinc.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
minizinc"

inherit rpm
