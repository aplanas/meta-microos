SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49312"

RPM_NAME = "texlive-xindex-bin-2023.20230311.svn49312-93.1.aarch64.rpm"
RPM_HASH = "5969727152a863dfd104dfbceab3d0a8255c7e5b6672bc189ac6f4fafa4238a5449e7c51f966c7d373c9eb38afa8fe2d706a393bae29dd337288c1e0938494b7"

RPROVIDES:${PN} += "texlive-xindex-bin"

RDEPENDS:${PN} += "texlive-xindex"

inherit rpm
