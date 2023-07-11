SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ctie-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "40adb51575ea78e34395084b3800c17b574ad0d2738329e380113d9ba2bc9ef062696f38d85d3f87f9b10cd3fd6d8fe1fcd47eca11d0f59561b20a381ec2c544"

RPROVIDES:${PN} += "texlive-ctie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-ctie"

inherit rpm
