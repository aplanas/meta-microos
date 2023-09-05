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

PV = "20230901"

RPM_NAME = "libre2-11-20230901-56.1.aarch64.rpm"
RPM_HASH = "191bd0a27dd7d744c7402ff7e1930c73fcd8b524e5d52f0487dd1a572ba64ec8bf14298c7db0fbfd974abb47c4d7c4034966f5e7fcd49b8a94b9f6ce8aea5217"

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
