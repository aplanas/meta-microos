SUMMARY = "Mono's Visual Basic Compiler and Runtime"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono's VB runtime."
LICENSE = "LGPL-2.1"

PV = "4.7"

RPM_NAME = "mono-basic-4.7-2.9.noarch.rpm"
RPM_HASH = "3c782e4b3d3e0c1b08b9488fbbb2ce3e9709352faea4cd82d8c1b6f73e0b1248858f901b8e174fda4b7da1740f50b5970ae9c84765d146a64842438b77d2ee56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Microsoft.VisualBasic \
mono-Mono.Cecil.VB \
mono-Mono.Cecil.VB.Mdb \
mono-Mono.Cecil.VB.Pdb \
mono-basic \
mono-vbnc"

RDEPENDS:${PN} += "/bin/sh \
mono-System \
mono-System.Core \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-mscorlib"

inherit rpm
