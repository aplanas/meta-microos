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

RPM_NAME = "libre2-11-20230901-56.2.aarch64.rpm"
RPM_HASH = "153ae7fd037c64fba297225491295258ea6275ece02218947406b9507dcc62e6014b54e707dfd03d85e3a668857c5eeb00534df695483a937740621930bd160a"

RPROVIDES:${PN} += "libre2-11 \
libre2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
