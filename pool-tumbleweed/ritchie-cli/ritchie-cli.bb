SUMMARY = "Ritchie - One CLI to rule them all"
DESCRIPTION = "Ritchie is an open source framework that creates and tweaks a CLI for your team. It allows you to easily create, build and share formulas. This package contains the CLI core, which can execute formulas stored inside other repositories such as ritchie-formulas."
LICENSE = "Apache-2.0"

PV = "2.11.3"

RPM_NAME = "ritchie-cli-2.11.3-2.10.aarch64.rpm"
RPM_HASH = "246dd2e92c031ede4bb9033d0a40fe227d1edb42e101b215b644ea65a2c509653f4586607b2888ba87193d4f7e305a4a1da7ab0fd9a455953ae25cd3d71ec50a"

RPROVIDES:${PN} += "ritchie-cli \
ritchie-cli(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
