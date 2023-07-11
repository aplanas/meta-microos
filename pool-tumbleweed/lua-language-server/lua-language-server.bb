SUMMARY = "Lua Language Server coded by Lua"
DESCRIPTION = "This package provides a Language Server Protocol (LSP) implementation for Lua."
LICENSE = "MIT"

PV = "3.6.18"

RPM_NAME = "lua-language-server-3.6.18-1.2.aarch64.rpm"
RPM_HASH = "66781ad94fcc44aaf51bb7450d524531bdae69693f286ad860104197fc1a7b8bf3573b8322885ebec33a0572b9040cf01bc7e118e8ea2e197430632c6ba4c991"

RPROVIDES:${PN} += "lua-language-server"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libm.so.6"

inherit rpm
