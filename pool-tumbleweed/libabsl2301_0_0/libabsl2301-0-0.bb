SUMMARY = "C++11 libraries which augment the C++ stdlib"
DESCRIPTION = "Abseil is a collection of C++11 libraries which augment the C++ \
standard library. It also provides features incorporated into C++14 \
and C++17 standards."
LICENSE = "Apache-2.0"

PV = "20230125.3"

RPM_NAME = "libabsl2301_0_0-20230125.3-1.1.aarch64.rpm"
RPM_HASH = "7498f91a3e940d9a4fb3a05226a514a2125f69d0deeb9b13d49c36422d1bab97697369b9ec41dd549573ed485aaf1ced4216f95aa25486bac446388308546ce6"

RPROVIDES:${PN} += "abseil-cpp \
libabsl2301_0_0 \
libabsl2301_0_0(aarch-64) \
libabsl_bad_any_cast_impl.so.2301.0.0()(64bit) \
libabsl_bad_optional_access.so.2301.0.0()(64bit) \
libabsl_bad_variant_access.so.2301.0.0()(64bit) \
libabsl_base.so.2301.0.0()(64bit) \
libabsl_city.so.2301.0.0()(64bit) \
libabsl_civil_time.so.2301.0.0()(64bit) \
libabsl_cord.so.2301.0.0()(64bit) \
libabsl_cord_internal.so.2301.0.0()(64bit) \
libabsl_cordz_functions.so.2301.0.0()(64bit) \
libabsl_cordz_handle.so.2301.0.0()(64bit) \
libabsl_cordz_info.so.2301.0.0()(64bit) \
libabsl_cordz_sample_token.so.2301.0.0()(64bit) \
libabsl_crc32c.so.2301.0.0()(64bit) \
libabsl_crc_cord_state.so.2301.0.0()(64bit) \
libabsl_crc_cpu_detect.so.2301.0.0()(64bit) \
libabsl_crc_internal.so.2301.0.0()(64bit) \
libabsl_debugging_internal.so.2301.0.0()(64bit) \
libabsl_demangle_internal.so.2301.0.0()(64bit) \
libabsl_die_if_null.so.2301.0.0()(64bit) \
libabsl_examine_stack.so.2301.0.0()(64bit) \
libabsl_exponential_biased.so.2301.0.0()(64bit) \
libabsl_failure_signal_handler.so.2301.0.0()(64bit) \
libabsl_flags.so.2301.0.0()(64bit) \
libabsl_flags_commandlineflag.so.2301.0.0()(64bit) \
libabsl_flags_commandlineflag_internal.so.2301.0.0()(64bit) \
libabsl_flags_config.so.2301.0.0()(64bit) \
libabsl_flags_internal.so.2301.0.0()(64bit) \
libabsl_flags_marshalling.so.2301.0.0()(64bit) \
libabsl_flags_parse.so.2301.0.0()(64bit) \
libabsl_flags_private_handle_accessor.so.2301.0.0()(64bit) \
libabsl_flags_program_name.so.2301.0.0()(64bit) \
libabsl_flags_reflection.so.2301.0.0()(64bit) \
libabsl_flags_usage.so.2301.0.0()(64bit) \
libabsl_flags_usage_internal.so.2301.0.0()(64bit) \
libabsl_graphcycles_internal.so.2301.0.0()(64bit) \
libabsl_hash.so.2301.0.0()(64bit) \
libabsl_hashtablez_sampler.so.2301.0.0()(64bit) \
libabsl_int128.so.2301.0.0()(64bit) \
libabsl_leak_check.so.2301.0.0()(64bit) \
libabsl_log_entry.so.2301.0.0()(64bit) \
libabsl_log_flags.so.2301.0.0()(64bit) \
libabsl_log_globals.so.2301.0.0()(64bit) \
libabsl_log_initialize.so.2301.0.0()(64bit) \
libabsl_log_internal_check_op.so.2301.0.0()(64bit) \
libabsl_log_internal_conditions.so.2301.0.0()(64bit) \
libabsl_log_internal_format.so.2301.0.0()(64bit) \
libabsl_log_internal_globals.so.2301.0.0()(64bit) \
libabsl_log_internal_log_sink_set.so.2301.0.0()(64bit) \
libabsl_log_internal_message.so.2301.0.0()(64bit) \
libabsl_log_internal_nullguard.so.2301.0.0()(64bit) \
libabsl_log_internal_proto.so.2301.0.0()(64bit) \
libabsl_log_severity.so.2301.0.0()(64bit) \
libabsl_log_sink.so.2301.0.0()(64bit) \
libabsl_low_level_hash.so.2301.0.0()(64bit) \
libabsl_malloc_internal.so.2301.0.0()(64bit) \
libabsl_periodic_sampler.so.2301.0.0()(64bit) \
libabsl_random_distributions.so.2301.0.0()(64bit) \
libabsl_random_internal_distribution_test_util.so.2301.0.0()(64bit) \
libabsl_random_internal_platform.so.2301.0.0()(64bit) \
libabsl_random_internal_pool_urbg.so.2301.0.0()(64bit) \
libabsl_random_internal_randen.so.2301.0.0()(64bit) \
libabsl_random_internal_randen_hwaes.so.2301.0.0()(64bit) \
libabsl_random_internal_randen_hwaes_impl.so.2301.0.0()(64bit) \
libabsl_random_internal_randen_slow.so.2301.0.0()(64bit) \
libabsl_random_internal_seed_material.so.2301.0.0()(64bit) \
libabsl_random_seed_gen_exception.so.2301.0.0()(64bit) \
libabsl_random_seed_sequences.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_raw_logging_internal.so.2301.0.0()(64bit) \
libabsl_scoped_set_env.so.2301.0.0()(64bit) \
libabsl_spinlock_wait.so.2301.0.0()(64bit) \
libabsl_stacktrace.so.2301.0.0()(64bit) \
libabsl_status.so.2301.0.0()(64bit) \
libabsl_statusor.so.2301.0.0()(64bit) \
libabsl_str_format_internal.so.2301.0.0()(64bit) \
libabsl_strerror.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_strings_internal.so.2301.0.0()(64bit) \
libabsl_symbolize.so.2301.0.0()(64bit) \
libabsl_synchronization.so.2301.0.0()(64bit) \
libabsl_throw_delegate.so.2301.0.0()(64bit) \
libabsl_time.so.2301.0.0()(64bit) \
libabsl_time_zone.so.2301.0.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
