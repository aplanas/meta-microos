SUMMARY = "Libraries and Header Files to Develop Programs with libiniparser Support"
DESCRIPTION = "This package contains the static libraries and header files needed to \
develop programs which make use of the libiniparser programming \
interface. \
 \
The libiniparser offers parsing of ini files from the C level.	See a \
complete documentation in HTML format, from the \
/usr/share/doc/packages/libiniparser-devel directory open the file \
html/index.html with any HTML-capable browser. \
 \
Libraries and Header Files to Develop Programs with iniparser Support."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "libiniparser-devel-4.1-3.1.aarch64.rpm"
RPM_HASH = "34a9e0c1e5964df3fc7b534b36e35477f56b6b032ab1e0258938e9ebe4b7098063176af59873bca6cd77297f0c2fc7d25b0f8a16e1149fc69bde6950faf88c8f"

RPROVIDES:${PN} += "libiniparser-devel"

RDEPENDS:${PN} += "libiniparser1"

inherit rpm
