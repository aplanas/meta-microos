SUMMARY = "Severed fonts for texlive-stmaryrd"
DESCRIPTION = "The  separated fonts package for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22027"

RPM_NAME = "texlive-stmaryrd-fonts-2023.209.svn22027-58.1.noarch.rpm"
RPM_HASH = "5a53ac94138979f4a8685ba51748c999307e5222668dfa43321afede8f9be012c8a6dcca08d576aa88496ef97462589c56cef36461c368cac5b205fb08c8eb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-stmary10 \
font-stmary5 \
font-stmary6 \
font-stmary7 \
font-stmary8 \
font-stmary9 \
texlive-stmaryrd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
