SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-jadetex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "897d7b63f904d1f1ba98f2d25186472a27594bfb30d1dc9369d00cd21a4e3ad0d6617ffba556d3676c284dd656f19f60dd6bf1d34abfc4fa763c169d65aca29f"

RPROVIDES:${PN} += "texlive-jadetex-bin"

RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm
