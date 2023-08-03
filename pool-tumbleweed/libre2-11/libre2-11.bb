SUMMARY = "C++ fast alternative to backtracking RE engines"
DESCRIPTION = "RE2 is a C++ library providing a fast, safe, thread-friendly alternative to \
backtracking regular expression engines like those used in PCRE, Perl, and \
Python. \
 \
Backtracking engines are typically full of features and convenient syntactic \
sugar but can be forced into taking exponential amounts of time on even small \
inputs. \
 \
In contrast, RE2 uses automata theory to guarantee that regular expression \
searches run in time linear in the size of the input, at the expense of some \
missing features (e.g. back references and generalized assertions)."
LICENSE = "BSD-3-Clause"

PV = "20230701"

RPM_NAME = "libre2-11-20230701-54.1.aarch64.rpm"
RPM_HASH = "47a8e4f8fe5b6f364d2deae49090a82e302119587713eecbe89c0aa9ebf1e5eb59732e5dfca89ce34e2465ebdee1c44bba70e2f85e584a0b2924c096a9c83131"

RPROVIDES:${PN} += "libre2-11 \
libre2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-spinlock-wait.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
