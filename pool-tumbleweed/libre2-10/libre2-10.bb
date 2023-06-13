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

RPM_NAME = "libre2-10-20230301-53.4.aarch64.rpm"
RPM_HASH = "5f7488a87060ec6a595b1976abe3220ed1b16497c29768e99cb61fd3532d3c1df1f14495e0d83deae4df1a9b6012318cb7a87df385d037732ef089900d7a2bed"

RPROVIDES:${PN} += "libre2-10 \
libre2-10(aarch-64) \
libre2.so.10()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
