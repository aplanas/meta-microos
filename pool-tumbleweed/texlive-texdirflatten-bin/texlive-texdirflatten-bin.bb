SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2023.20230311.svn12782-93.1.aarch64.rpm"
RPM_HASH = "7291ccd5552a8b247cacd958784031fe303f84ecd5eb4813131cc2a94d79b010263a393d88b44b62029a8137b960b67a76f5127524328a53a055d5e0320180c8"

RPROVIDES:${PN} += "texlive-texdirflatten-bin"

RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm
