SUMMARY = "Fast static site generator"
DESCRIPTION = "Zola is a static site generator (SSG), similar to Hugo, Pelican, and Jekyll. \
It is written in Rust and uses the Tera template engine, which is similar to \
Jinja2, Django templates, Liquid, and Twig. Content is written in CommonMark, \
a strongly defined, highly compatible specification of Markdown."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-0.17.2-2.1.aarch64.rpm"
RPM_HASH = "d30702546728393feed4579db39a0ae5e09eb67453448ad045107b762f2745e5b3fbf919ff27d17837da556a50351dabf703b0df0e10d5decb46fecb336d35e2"

RPROVIDES:${PN} += "bundled(rust-crate:BROKEN) \
zola \
zola(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
