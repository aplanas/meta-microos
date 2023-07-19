SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2023.20230311.svn49033-93.1.aarch64.rpm"
RPM_HASH = "b3f886cae2169cf43a79a6c0af9a6f2745ac2d150ecc54bca98a29884b6e50a979c145458d7ff3d63c59d49d9413d33ce0e9f11f4da2452bafd2b4f39c0398a1"

RPROVIDES:${PN} += "texlive-ketcindy-bin"

RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm
