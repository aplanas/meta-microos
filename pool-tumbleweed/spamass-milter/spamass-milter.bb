SUMMARY = "Milter (mail filter) for spamassassin"
DESCRIPTION = "A milter (Mail Filter) application that pipes incoming mail (including things \
received by rmail/UUCP) through SpamAssassin, a highly customizable spam \
filter. A milter-compatible MTA such as Sendmail or Postfix is required."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "spamass-milter-0.4.0-3.6.aarch64.rpm"
RPM_HASH = "5e50c63d995b92780e628f84b543669e78991160c1571c354cc101892740a8c0b46d99cce5002dcd3ad3a7bda5b0aae6a80b052633100561659e69970d9d19f4"

RPROVIDES:${PN} += "config(spamass-milter) \
group(sa-milter) \
spamass-milter \
spamass-milter(aarch-64) \
user(sa-milter)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmilter.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
postfix \
spamassassin-spamc \
sysuser-shadow"

inherit rpm
