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

RPM_NAME = "glow-1.5.1-1.1.aarch64.rpm"
RPM_HASH = "086286be7cb8215d8454248d6303fb893ebc7ce0ae5e9faf2f6ee570de51f907292831f3be035435796913568f309df2cf93fc232c188557695e6b5a1abc566a"

RPROVIDES:${PN} += "glow \
glow(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
