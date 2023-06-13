SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools9-9.6-1.1.aarch64.rpm"
RPM_HASH = "994a223ab5782f3372a2b4e5759c5f84c1569f732464e1d49081de33dee6e4e7758b0bf62aa54c59228ef8158c3691faed9b8900fc000d630f12d82c292140ee"

RPROVIDES:${PN} += "libortools.so.9()(64bit) \
libortools9 \
libortools9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libabsl_die_if_null.so.2301.0.0()(64bit) \
libabsl_flags_internal.so.2301.0.0()(64bit) \
libabsl_flags_marshalling.so.2301.0.0()(64bit) \
libabsl_flags_parse.so.2301.0.0()(64bit) \
libabsl_flags_reflection.so.2301.0.0()(64bit) \
libabsl_flags_usage.so.2301.0.0()(64bit) \
libabsl_hash.so.2301.0.0()(64bit) \
libabsl_int128.so.2301.0.0()(64bit) \
libabsl_leak_check.so.2301.0.0()(64bit) \
libabsl_log_flags.so.2301.0.0()(64bit) \
libabsl_log_globals.so.2301.0.0()(64bit) \
libabsl_log_initialize.so.2301.0.0()(64bit) \
libabsl_log_internal_check_op.so.2301.0.0()(64bit) \
libabsl_log_internal_conditions.so.2301.0.0()(64bit) \
libabsl_log_internal_message.so.2301.0.0()(64bit) \
libabsl_log_internal_nullguard.so.2301.0.0()(64bit) \
libabsl_random_distributions.so.2301.0.0()(64bit) \
libabsl_random_internal_pool_urbg.so.2301.0.0()(64bit) \
libabsl_random_internal_randen.so.2301.0.0()(64bit) \
libabsl_random_internal_randen_hwaes_impl.so.2301.0.0()(64bit) \
libabsl_random_internal_randen_slow.so.2301.0.0()(64bit) \
libabsl_random_internal_seed_material.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_status.so.2301.0.0()(64bit) \
libabsl_statusor.so.2301.0.0()(64bit) \
libabsl_str_format_internal.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_strings_internal.so.2301.0.0()(64bit) \
libabsl_synchronization.so.2301.0.0()(64bit) \
libabsl_throw_delegate.so.2301.0.0()(64bit) \
libabsl_time.so.2301.0.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
