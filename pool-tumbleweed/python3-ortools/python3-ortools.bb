SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Python3 bindings for the OR-Tools suite, for solving combinatorial \
optimization problems."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "python3-ortools-9.6-1.1.aarch64.rpm"
RPM_HASH = "5a5686acc6d36e994e37555d0bb0d41ee078dfdccac4df5170cf4997da93a947ae43954cff3e7c7612cec99e484a287f718cbbb499e410e0e54ea7c531940d61"

RPROVIDES:${PN} += "python3-ortools \
python3-ortools(aarch-64) \
python3.10dist(ortools) \
python3dist(ortools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libabsl_flags_internal.so.2301.0.0()(64bit) \
libabsl_flags_usage.so.2301.0.0()(64bit) \
libabsl_hash.so.2301.0.0()(64bit) \
libabsl_log_flags.so.2301.0.0()(64bit) \
libabsl_log_globals.so.2301.0.0()(64bit) \
libabsl_log_initialize.so.2301.0.0()(64bit) \
libabsl_log_internal_check_op.so.2301.0.0()(64bit) \
libabsl_log_internal_message.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_status.so.2301.0.0()(64bit) \
libabsl_str_format_internal.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_throw_delegate.so.2301.0.0()(64bit) \
libabsl_time.so.2301.0.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libortools.so.9()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python3-absl-py \
python3-numpy"

inherit rpm
