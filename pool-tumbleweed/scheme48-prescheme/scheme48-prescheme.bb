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

RPM_NAME = "scheme48-prescheme-1.9.2-2.20.aarch64.rpm"
RPM_HASH = "910364a1459fbba8cb265743f82bfa1b9184e864f0100201f231357872a15192ba3def927f833f35aca6295c86cf5e9980b9046ea337bf752e56511923b63d72"

RPROVIDES:${PN} += "scheme48-prescheme"

RDEPENDS:${PN} += "/usr/bin/sh \
scheme48"

inherit rpm
