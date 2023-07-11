SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "lldb16-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "31b4c173f469c19862c80b8da4c85d7fbc37a997a10a940c8cb5bfa8ce26f9f5a7813f6a20bb42e52ae63ec908c48dcb3186a03d20a823acbae8a49e92608758"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb16-devel"

RDEPENDS:${PN} += "clang16-devel \
liblldb16 \
llvm16-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
