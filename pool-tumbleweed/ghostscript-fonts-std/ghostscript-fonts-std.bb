SUMMARY = "Basic Fonts for Ghostscript"
DESCRIPTION = "Several Type 1 basic PostScript fonts. \
Times, Helvetica, Courier, Symbol, etc. \
Contributed by URW++ Design and Development \
Incorporated, of Hamburg, Germany."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-std-9.06-13.10.noarch.rpm"
RPM_HASH = "66fe463e62534e6eb384e0d3fc61eaf70d82857f2de3eaac37617f2b40d2a0042f201826933a1775573058a315c3eaefff797f8c3c06e7d504c940994839f4f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts-std \
urw-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
