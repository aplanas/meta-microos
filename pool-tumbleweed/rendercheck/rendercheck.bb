SUMMARY = "Program to test a Render extension implementation"
DESCRIPTION = "rendercheck is a program to test a Render extension implementation \
against separate calculations of expected output."
LICENSE = "HPND"

PV = "1.5"

RPM_NAME = "rendercheck-1.5-1.27.aarch64.rpm"
RPM_HASH = "3b324bd8fe2c61eb383f602a21d02876b501d42fb49fc4e67a7ec954be3e11f7e963b0f7d001cb8c9f81739d50a7d12d493b2b6a122f32650d395110a68a0d26"

RPROVIDES:${PN} += "rendercheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6"

inherit rpm
