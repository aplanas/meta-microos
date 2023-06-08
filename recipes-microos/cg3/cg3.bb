SUMMARY = "VISL Constraint Grammar implementation"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later & MIT"

PV = "1.3.9"

RPM_NAME = "cg3-1.3.9-1.4.aarch64.rpm"
RPM_HASH = "217c4097288269dc10e2d79da86c00971e95e1e950c4bcc0a25b58f445c094ac05f47827e95aa3e1258a83375eff4e49fec262f841a80cac26db583ed80f276e"

RPROVIDES:${PN} += "cg3 cg3(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcg3.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) perl(Digest::SHA1) perl(File::Spec) perl(Getopt::Long)"

inherit rpm
