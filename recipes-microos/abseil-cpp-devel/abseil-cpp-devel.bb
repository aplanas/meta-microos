SUMMARY = "Header files for Abseil"
DESCRIPTION = "Abseil is a collection of C++11 libraries which augment the C++ \
standard library. \
This package contains headers and build system files for it."
LICENSE = "Apache-2.0"

PV = "20230125.3"

RPM_NAME = "abseil-cpp-devel-20230125.3-1.1.aarch64.rpm"
RPM_HASH = "d44b5f2d086a23b86990909e4c4944cdff926ee4ce6d2d56fc4dd61ee23d30e889d7fce53cc2633a7861c753bd1ee21c066b0ba4468d910e27c2b2f243a19455"

RPROVIDES:${PN} += "abseil-cpp-devel abseil-cpp-devel(aarch-64) cmake(absl) pkgconfig(absl_absl_check) pkgconfig(absl_absl_log) pkgconfig(absl_algorithm) pkgconfig(absl_algorithm_container) pkgconfig(absl_any) pkgconfig(absl_any_invocable) pkgconfig(absl_atomic_hook) pkgconfig(absl_bad_any_cast) pkgconfig(absl_bad_any_cast_impl) pkgconfig(absl_bad_optional_access) pkgconfig(absl_bad_variant_access) pkgconfig(absl_base) pkgconfig(absl_base_internal) pkgconfig(absl_bind_front) pkgconfig(absl_bits) pkgconfig(absl_btree) pkgconfig(absl_check) pkgconfig(absl_city) pkgconfig(absl_civil_time) pkgconfig(absl_cleanup) pkgconfig(absl_cleanup_internal) pkgconfig(absl_common_policy_traits) pkgconfig(absl_compare) pkgconfig(absl_compressed_tuple) pkgconfig(absl_config) pkgconfig(absl_container_common) pkgconfig(absl_container_memory) pkgconfig(absl_cord) pkgconfig(absl_cord_internal) pkgconfig(absl_cordz_functions) pkgconfig(absl_cordz_handle) pkgconfig(absl_cordz_info) pkgconfig(absl_cordz_sample_token) pkgconfig(absl_cordz_statistics) pkgconfig(absl_cordz_update_scope) pkgconfig(absl_cordz_update_tracker) pkgconfig(absl_core_headers) pkgconfig(absl_counting_allocator) pkgconfig(absl_crc32c) pkgconfig(absl_crc_cord_state) pkgconfig(absl_crc_cpu_detect) pkgconfig(absl_crc_internal) pkgconfig(absl_debugging) pkgconfig(absl_debugging_internal) pkgconfig(absl_demangle_internal) pkgconfig(absl_die_if_null) pkgconfig(absl_dynamic_annotations) pkgconfig(absl_endian) pkgconfig(absl_errno_saver) pkgconfig(absl_examine_stack) pkgconfig(absl_exponential_biased) pkgconfig(absl_failure_signal_handler) pkgconfig(absl_fast_type_id) pkgconfig(absl_fixed_array) pkgconfig(absl_flags) pkgconfig(absl_flags_commandlineflag) pkgconfig(absl_flags_commandlineflag_internal) pkgconfig(absl_flags_config) pkgconfig(absl_flags_internal) pkgconfig(absl_flags_marshalling) pkgconfig(absl_flags_parse) pkgconfig(absl_flags_path_util) pkgconfig(absl_flags_private_handle_accessor) pkgconfig(absl_flags_program_name) pkgconfig(absl_flags_reflection) pkgconfig(absl_flags_usage) pkgconfig(absl_flags_usage_internal) pkgconfig(absl_flat_hash_map) pkgconfig(absl_flat_hash_set) pkgconfig(absl_function_ref) pkgconfig(absl_graphcycles_internal) pkgconfig(absl_hash) pkgconfig(absl_hash_function_defaults) pkgconfig(absl_hash_policy_traits) pkgconfig(absl_hashtable_debug) pkgconfig(absl_hashtable_debug_hooks) pkgconfig(absl_hashtablez_sampler) pkgconfig(absl_inlined_vector) pkgconfig(absl_inlined_vector_internal) pkgconfig(absl_int128) pkgconfig(absl_kernel_timeout_internal) pkgconfig(absl_layout) pkgconfig(absl_leak_check) pkgconfig(absl_log) pkgconfig(absl_log_entry) pkgconfig(absl_log_flags) pkgconfig(absl_log_globals) pkgconfig(absl_log_initialize) pkgconfig(absl_log_internal_append_truncated) pkgconfig(absl_log_internal_check_impl) pkgconfig(absl_log_internal_check_op) pkgconfig(absl_log_internal_conditions) pkgconfig(absl_log_internal_config) pkgconfig(absl_log_internal_flags) pkgconfig(absl_log_internal_format) pkgconfig(absl_log_internal_globals) pkgconfig(absl_log_internal_log_impl) pkgconfig(absl_log_internal_log_sink_set) pkgconfig(absl_log_internal_message) pkgconfig(absl_log_internal_nullguard) pkgconfig(absl_log_internal_nullstream) pkgconfig(absl_log_internal_proto) pkgconfig(absl_log_internal_strip) pkgconfig(absl_log_internal_structured) pkgconfig(absl_log_internal_voidify) pkgconfig(absl_log_severity) pkgconfig(absl_log_sink) pkgconfig(absl_log_sink_registry) pkgconfig(absl_log_streamer) pkgconfig(absl_log_structured) pkgconfig(absl_low_level_hash) pkgconfig(absl_malloc_internal) pkgconfig(absl_memory) pkgconfig(absl_meta) pkgconfig(absl_node_hash_map) pkgconfig(absl_node_hash_set) pkgconfig(absl_node_slot_policy) pkgconfig(absl_non_temporal_arm_intrinsics) pkgconfig(absl_non_temporal_memcpy) pkgconfig(absl_numeric) pkgconfig(absl_numeric_representation) pkgconfig(absl_optional) pkgconfig(absl_periodic_sampler) pkgconfig(absl_prefetch) pkgconfig(absl_pretty_function) pkgconfig(absl_random_bit_gen_ref) pkgconfig(absl_random_distributions) pkgconfig(absl_random_internal_distribution_caller) pkgconfig(absl_random_internal_distribution_test_util) pkgconfig(absl_random_internal_fast_uniform_bits) pkgconfig(absl_random_internal_fastmath) pkgconfig(absl_random_internal_generate_real) pkgconfig(absl_random_internal_iostream_state_saver) pkgconfig(absl_random_internal_mock_helpers) pkgconfig(absl_random_internal_nonsecure_base) pkgconfig(absl_random_internal_pcg_engine) pkgconfig(absl_random_internal_platform) pkgconfig(absl_random_internal_pool_urbg) pkgconfig(absl_random_internal_randen) pkgconfig(absl_random_internal_randen_engine) pkgconfig(absl_random_internal_randen_hwaes) pkgconfig(absl_random_internal_randen_hwaes_impl) pkgconfig(absl_random_internal_randen_slow) pkgconfig(absl_random_internal_salted_seed_seq) pkgconfig(absl_random_internal_seed_material) pkgconfig(absl_random_internal_traits) pkgconfig(absl_random_internal_uniform_helper) pkgconfig(absl_random_internal_wide_multiply) pkgconfig(absl_random_random) pkgconfig(absl_random_seed_gen_exception) pkgconfig(absl_random_seed_sequences) pkgconfig(absl_raw_hash_map) pkgconfig(absl_raw_hash_set) pkgconfig(absl_raw_logging_internal) pkgconfig(absl_sample_recorder) pkgconfig(absl_scoped_set_env) pkgconfig(absl_span) pkgconfig(absl_spinlock_wait) pkgconfig(absl_stacktrace) pkgconfig(absl_status) pkgconfig(absl_statusor) pkgconfig(absl_str_format) pkgconfig(absl_str_format_internal) pkgconfig(absl_strerror) pkgconfig(absl_strings) pkgconfig(absl_strings_internal) pkgconfig(absl_symbolize) pkgconfig(absl_synchronization) pkgconfig(absl_throw_delegate) pkgconfig(absl_time) pkgconfig(absl_time_zone) pkgconfig(absl_type_traits) pkgconfig(absl_utility) pkgconfig(absl_variant)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libabsl2301_0_0"

inherit rpm
