SUMMARY = "VISL Constraint Grammar implementation"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later & MIT"

PV = "1.3.9"

RPM_NAME = "cg3-1.3.9-1.5.aarch64.rpm"
RPM_HASH = "e08ccf320ab2bd5dbb7da7432354fa374cdea70103a10704c6cc89b3264e19b5f245e28dbef6b473c198021cbc6032b131b0c838cf37b9f760775f7b9806f60b"

RPROVIDES:${PN} += "cg3 \
cg3(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcg3.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit) \
perl(Digest::SHA1) \
perl(File::Spec) \
perl(Getopt::Long)"

inherit rpm
