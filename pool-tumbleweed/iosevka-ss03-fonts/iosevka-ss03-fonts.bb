SUMMARY = "Iosevka in monospace, Consolas style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS03 typeface (monospace, Consolas style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss03-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "94f2994f0c9909925299a9f37161b35a8af9553c1e43a2e22d5b979deff3883a6f7be17e44a786f5761ee74dcef604aceefdb5f44acc3f6b5c6a6a1ef5a3aaa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss03-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
