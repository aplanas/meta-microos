SUMMARY = "Fast static site generator"
DESCRIPTION = "Zola is a static site generator (SSG), similar to Hugo, Pelican, and Jekyll. \
It is written in Rust and uses the Tera template engine, which is similar to \
Jinja2, Django templates, Liquid, and Twig. Content is written in CommonMark, \
a strongly defined, highly compatible specification of Markdown."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-0.17.2-2.2.aarch64.rpm"
RPM_HASH = "2a09faf6ae18933247d8b87565b3a21798ac15d6d65e28e44d03048036e92e2f12406bd94fed88b9d4499cabcd477f978c4dc2808426778cd58e9fb080c805de"

RPROVIDES:${PN} += "bundled-rust-crate-BROKEN \
zola"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
