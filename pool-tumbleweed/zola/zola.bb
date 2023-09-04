SUMMARY = "Fast static site generator"
DESCRIPTION = "Zola is a static site generator (SSG), similar to Hugo, Pelican, and Jekyll. \
It is written in Rust and uses the Tera template engine, which is similar to \
Jinja2, Django templates, Liquid, and Twig. Content is written in CommonMark, \
a strongly defined, highly compatible specification of Markdown."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-0.17.2-3.1.aarch64.rpm"
RPM_HASH = "64bddb624dd2d20f1886141c336ac9be6152486d59c6f5ef0e9dfe51883ce1b5570c8fe6c0a179583dc3499dfecef19c76aadd72595290d5c0e4b9aed706415c"

RPROVIDES:${PN} += "bundled-rust-crate-BROKEN \
zola"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
