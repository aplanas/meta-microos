SUMMARY = "Render markdown on the CLI"
DESCRIPTION = "Glow is a terminal based markdown reader designed from the ground up to bring \
out the beauty—and power—of the CLI. \
 \
Use it to discover markdown files, read documentation directly on the command \
line and stash markdown files to your own private collection so you can read \
them anywhere. Glow will find local markdown files in subdirectories or a local \
Git repository."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "glow-1.5.1-2.1.aarch64.rpm"
RPM_HASH = "8342001aee0d23d3a55e19789cf5c12f8ba8041ea3545583d3b4e6368d3df8141cb1603802184ff06ab5cf2b0667f805c6134eb73537b10318318eab577b8d3c"

RPROVIDES:${PN} += "glow"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
