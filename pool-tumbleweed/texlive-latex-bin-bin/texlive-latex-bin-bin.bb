SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2023.20230311.svn54358-93.1.aarch64.rpm"
RPM_HASH = "3c48a696630a462d8395ff81711f4e49405c65ade56c6d913a75075e91c513c9f7921dc79f9c7321ed653a2459cb3467a53c422a0f49d52cf8eadc0379701d5b"

RPROVIDES:${PN} += "texlive-latex-bin-bin"

RDEPENDS:${PN} += "texlive-latex-bin"

inherit rpm
