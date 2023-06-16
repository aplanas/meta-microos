SUMMARY = "PreScheme compiler"
DESCRIPTION = "Pre-Scheme is a low-level dialect of Scheme, designed for systems programming \
with higher-level abstractions. For example, the Scheme48 virtual machine is \
written in Pre-Scheme. Pre-Scheme is a particularly interesting alternative to \
C for many systems programming tasks, because not only does it operate at about \
the same level as C, but it also may be run in a regular high-level Scheme \
development with no changes to the source, without resorting to low-level stack \
munging with tools such as gdb. Pre-Scheme also supports two extremely \
important high-level abstractions of Scheme: macros and higher-order, anonymous \
functions. Richard Kelsey's Pre-Scheme compiler, based on his PhD research on \
transformational compilation, compiles Pre-Scheme to efficient C, applying \
numerous intermediate source transformations in the process."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-prescheme-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "34d33527a33e4fb9c25cc0b70881b7388af371b579f77c06e5156b42fd517017c579efe57718d21aadda0d9f211897564cfd39721d3e684e974aa118f3ceae10"

RPROVIDES:${PN} += "scheme48-prescheme"

RDEPENDS:${PN} += "/usr/bin/sh \
scheme48"

inherit rpm
