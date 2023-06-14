SUMMARY = "Development files for OpenSubdiv"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for OpenSubdiv. If you would like to develop programs using OpenSubdiv, \
you will need to install OpenSubdiv-devel."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "OpenSubdiv-devel-3.4.4-1.8.aarch64.rpm"
RPM_HASH = "17cc8456ae2ccde53424f78dd5fa54f0f96dc51ee17bd86c2446f0f6f5ab2ab173133b458461b6a328af70de116e260a94af0fab2fb3c3a7817ec2704db8f079"

RPROVIDES:${PN} += "OpenSubdiv-devel"

RDEPENDS:${PN} += "libosdCPU3-4-4"

inherit rpm
