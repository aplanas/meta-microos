SUMMARY = "Remakes of IBM 6150 prototype fonts"
DESCRIPTION = "This fontpack contains remakes of prototype fonts designed for a \
project codenamed Olympiad, which later became the IBM 6150, a.k.a. \
the RT PC, a RISC workstation and grandaddy of the PowerPC \
architecture."
LICENSE = "CC-BY-SA-4.0"

PV = "1.0"

RPM_NAME = "int10h-olympiad-fonts-1.0-1.1.noarch.rpm"
RPM_HASH = "e40bfd4504079047a04cda3c7e0503852b6892a38ec14690cfb2b8fcef71b89df3506e7ce54d64bf1f9c2bdd6afd09d2927ee46b200d035701ea331682085f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "int10h-olympiad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
