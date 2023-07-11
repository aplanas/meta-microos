SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32346"

RPM_NAME = "texlive-ltximg-bin-2023.20230311.svn32346-92.1.aarch64.rpm"
RPM_HASH = "8e283d9b818d0775981cf3ecc40b4604db66b106f4fded167a0a7b829a89a5d0856b9ce40cc4b45e0287c7c397b3205642a8b7e714dcfe1d1dd5ec3058d3000f"

RPROVIDES:${PN} += "texlive-ltximg-bin"

RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm
