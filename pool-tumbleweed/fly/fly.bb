SUMMARY = "A Script to Create PNGs"
DESCRIPTION = "Fly allows you to create images with script statements. It uses gdlib."
LICENSE = "SUSE-Permissive"

PV = "2.0.1"

RPM_NAME = "fly-2.0.1-1.18.aarch64.rpm"
RPM_HASH = "fd875de46f9d39e78c98b2cc240a8b6970a3a2049210e27b22dc447b8882b54a6b1d10670ba0245e725cf24b5893112d8c59bde7df1401eb78aa3d0ca9a43a6f"

RPROVIDES:${PN} += "fly"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
