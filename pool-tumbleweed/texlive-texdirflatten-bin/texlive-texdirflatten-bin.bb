SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2023.20230311.svn12782-93.2.aarch64.rpm"
RPM_HASH = "a82c06005552b5de55cc7bd29bc39c6a75bca1da6e0c9cd56d97e09f082feda226ce970027fb67a58e4be21d0fa8ee2c08e75c0b3d256dc2e3c1d300cd76b0f5"

RPROVIDES:${PN} += "texlive-texdirflatten-bin"

RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm
