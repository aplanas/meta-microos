SUMMARY = "Filesystem Hierarchy Standard"
DESCRIPTION = "This standard consists of a set of requirements and guidelines for file \
and directory placement under UNIX-like operating systems.  The \
guidelines are intended to support application interoperability, system \
administration tools, development tools, and scripts as well as greater \
uniformity of documentation for these systems."
LICENSE = "SUSE-FHS"

PV = "3.0"

RPM_NAME = "fhs-3.0-1.6.noarch.rpm"
RPM_HASH = "263a6937efc6d4b7c5e5c36defb2d5be21e7f6c9c4d06e03599c274bf212f9fa55c77c742ab9a325304df44b0335c43ca6539bced4dbf110bf173625485bc06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fhs"

RDEPENDS:${PN} += ""

inherit rpm
