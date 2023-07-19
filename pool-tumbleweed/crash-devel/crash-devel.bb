SUMMARY = "Development files for crash"
DESCRIPTION = "This files are required to build extensions for crash. \
 \
Crash is the core analysis suite that can be used to investigate either \
live systems, kernel core dumps created from the netdump and diskdump \
packages from Red Hat Linux, the mcore kernel patch offered by Mission \
Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.3"

RPM_NAME = "crash-devel-8.0.3-1.11.aarch64.rpm"
RPM_HASH = "774a3427aa855b0029562536ecc17992bb2439f69c1f059b16ba37fb39a0325bbdaeb4f892ed66f0f9911ae00989a5e6cf05af65bff61c71545134152bf209f3"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
