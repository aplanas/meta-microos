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

PV = "20230301"

RPM_NAME = "libre2-10-20230301-1.1.aarch64.rpm"
RPM_HASH = "c83f7709bc9c26b2e7286c03aec6213b3768ecec4b68eb77d5298a4f1182782f36c5719b32bc83326a00831889948254834f57a73afd0bc762c60b984ef01d05"

RPROVIDES:${PN} += "libre2-10 \
libre2.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
