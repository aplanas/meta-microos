SUMMARY = "Binary files of splitindex"
DESCRIPTION = "Binary files of splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29688"

RPM_NAME = "texlive-splitindex-bin-2023.20230311.svn29688-93.2.aarch64.rpm"
RPM_HASH = "a1bb56d1131b96d16da4094b3bdc6458374bbb200aaa3233e172067ab33677d90bfa3e9c90617f8eb94fc2b47ab1735c6c810a7674259feb766d615c3efe589b"

RPROVIDES:${PN} += "texlive-splitindex-bin"

RDEPENDS:${PN} += "texlive-splitindex"

inherit rpm
