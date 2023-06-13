SUMMARY = "A Multiplatform Word Processor - Documentation"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform. For extended functionality and integration, this version \
is compiled with GNOME support. Abiword with the GNOME front-end is \
part of the GNOME Office Suite."
LICENSE = "GPL-2.0"

PV = "3.0.2"

RPM_NAME = "abiword-docs-3.0.2-1.15.noarch.rpm"
RPM_HASH = "5f19c2ee4ddeb1cb4e2a782266c0b42149e0d005bf868c0ad7820bd857ea2ee3a429ee54a78c36ea48e5b2408b0c6a125332377b14cae0c71f6696e0157cad8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abiword-docs"

RDEPENDS:${PN} += "abiword"

inherit rpm
